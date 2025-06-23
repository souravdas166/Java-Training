package com.java.phonepay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.phonepay.model.Account;
import com.java.phonepay.util.ConnectionHelper;

public class DaoImpl implements DaoPhonepay {

    Connection connection;
    PreparedStatement psmt;

    @Override
    public int validate(String userName, String password) throws ClassNotFoundException, SQLException {
        String cmd = "SELECT UserName, Passcode FROM Accounts WHERE UserName = ? AND Passcode = ?";
        connection = ConnectionHelper.getConnection();
        psmt = connection.prepareStatement(cmd);
        psmt.setString(1, userName);
        psmt.setString(2, password);

        ResultSet rs = psmt.executeQuery();
        if (rs.next()) {
            return 1; // valid credentials
        }
        return 0; // invalid credentials
    }

    @Override
    public int debit(double receiverMobile, double transferAmt, String userName, String password) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();

        if (validate(userName, password) == 1) {
            // Step 1: Get sender details
            String senderQuery = "SELECT AccountNo, Amount FROM Accounts WHERE UserName = ? AND Passcode = ?";
            psmt = connection.prepareStatement(senderQuery);
            psmt.setString(1, userName);
            psmt.setString(2, password);

            ResultSet senderRs = psmt.executeQuery();

            if (senderRs.next()) {
                int senderAccNo = senderRs.getInt("AccountNo");
                double senderBalance = senderRs.getDouble("Amount");

                if (senderBalance < transferAmt) {
                    System.out.println("❌ Insufficient Balance");
                    return -2;
                }

                // Step 2: Get receiver details
                String receiverQuery = "SELECT AccountNo FROM Accounts WHERE MobileNo = ?";
                PreparedStatement receiverStmt = connection.prepareStatement(receiverQuery);
                receiverStmt.setDouble(1, receiverMobile);
                ResultSet receiverRs = receiverStmt.executeQuery();

                if (receiverRs.next()) {
                    int receiverAccNo = receiverRs.getInt("AccountNo");

                    // Step 3: Start Transaction
                    connection.setAutoCommit(false); // Start transaction block

                    try {
                        // Deduct from sender
                        String debitCmd = "UPDATE Accounts SET Amount = Amount - ? WHERE AccountNo = ?";
                        PreparedStatement debitStmt = connection.prepareStatement(debitCmd);
                        debitStmt.setDouble(1, transferAmt);
                        debitStmt.setInt(2, senderAccNo);
                        debitStmt.executeUpdate();

                        // Credit to receiver
                        String creditCmd = "UPDATE Accounts SET Amount = Amount + ? WHERE AccountNo = ?";
                        PreparedStatement creditStmt = connection.prepareStatement(creditCmd);
                        creditStmt.setDouble(1, transferAmt);
                        creditStmt.setInt(2, receiverAccNo);
                        creditStmt.executeUpdate();

                        // Log sender transaction
                        String transSender = "INSERT INTO Trans (AccountNo, TranAmount, TranType) VALUES (?, ?, ?)";
                        PreparedStatement transStmtSender = connection.prepareStatement(transSender);
                        transStmtSender.setInt(1, senderAccNo);
                        transStmtSender.setDouble(2, transferAmt);
                        transStmtSender.setString(3, "D"); // D for Debit
                        transStmtSender.executeUpdate();

                        // Log receiver transaction
                        String transReceiver = "INSERT INTO Trans (AccountNo, TranAmount, TranType) VALUES (?, ?, ?)";
                        PreparedStatement transStmtReceiver = connection.prepareStatement(transReceiver);
                        transStmtReceiver.setInt(1, receiverAccNo);
                        transStmtReceiver.setDouble(2, transferAmt);
                        transStmtReceiver.setString(3, "C"); // C for Credit
                        transStmtReceiver.executeUpdate();

                        // Commit if all successful
                        connection.commit();
                        System.out.println("✅ Amount successfully transferred to mobile: " + receiverMobile);
                        return 1;

                    } catch (SQLException ex) {
                        connection.rollback(); // Rollback on failure
                        System.out.println("❌ Transaction failed, rolled back.");
                        ex.printStackTrace();
                        return -3;
                    } finally {
                        connection.setAutoCommit(true); // Reset auto-commit
                    }

                } else {
                    System.out.println("❌ Receiver mobile number not found.");
                    return 0;
                }
            } else {
                System.out.println("❌ Invalid user credentials.");
                return -1;
            }

        } else {
            System.out.println("❌ Invalid credentials.");
            return -1;
        }
    }



}
package com.java.bankproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.bankproject.model.Accounts;
import com.java.bankproject.util.ConnectionHelper;

public class BankDaoImpl implements BankDao {
	
	Connection connection;
	PreparedStatement pstm;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException{
		String cmd = "select case when max(AccountNo) is Null then 1 else max(AccountNo)+1 end GenerateAccountNo from Accounts";
		connection = ConnectionHelper.getConnection();
		pstm = connection.prepareStatement(cmd);
		ResultSet rs = pstm.executeQuery();
		rs.next();
		return rs.getInt("GenerateAccountNo");
	}
	
	@Override
	public String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException {
			int id = generateAccountNo();
			accounts.setAccountNo(id);
			String cmd = "Insert into Account(AccountNo,FirstName,LastName,City,State,Amount,CheqFacil,AccountType) values(?,?,?,?,?,?,?,?)";
			connection = ConnectionHelper.getConnection();
			pstm = connection.prepareStatement(cmd);
			pstm.setInt(1, accounts.getAccountNo());
			pstm.setString(2, accounts.getFirstName());
			pstm.setString(3, accounts.getLastName());
			pstm.setString(4, accounts.getCity());
			pstm.setString(5, accounts.getState());
			pstm.setDouble(6, accounts.getAmount());
			pstm.setString(7, accounts.getCheqFacil());
			pstm.setString(8, accounts.getAccountType());
			pstm.executeUpdate();
			return "Account Create sucessfully"; 
	}
	
	@Override
	public Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Accounts accounts = null;
		String cmd = "select * from accounts where accountNo = ?";
		connection = ConnectionHelper.getConnection();
		pstm = connection.prepareStatement(cmd);
		pstm.setInt(1, accountNo);
		ResultSet rs = pstm.executeQuery();
		if (rs.next()) {
			accounts = new Accounts();
			accounts.setAccountNo(rs.getInt("accountNo"));
			accounts.setFirstName(rs.getString("firstName"));
			accounts.setLastName(rs.getString("lastName"));
			accounts.setCity(rs.getString("city"));
			accounts.setState(rs.getString("state"));
			accounts.setAmount(rs.getDouble("amount")); 
			accounts.setCheqFacil(rs.getString("cheqFacil"));
			accounts.setAccountType(rs.getString("accountType"));
		}
		return accounts;
	}
	

}

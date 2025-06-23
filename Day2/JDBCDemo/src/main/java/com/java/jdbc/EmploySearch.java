package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Empno to Search:");
		empno = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitepractice", "root","9337596800");
//			System.out.println("Database Connected...");
			String cmd = "Select * from Employ where empno = ?";
			PreparedStatement pstm = conn.prepareStatement(cmd);
			pstm.setInt(1, empno);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				System.out.println("Employ No" +rs.getInt("empno"));
				System.out.println("Employ Name" +rs.getString("name"));
				System.out.println("Gender" +rs.getString("gender"));
				System.out.println("Department" +rs.getString("dept"));
				System.out.println("Designation" +rs.getString("design"));
				System.out.println("Basic" +rs.getDouble("basic"));
			}
			else {
				System.out.println("*** Employ Rescord Not Found ***");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

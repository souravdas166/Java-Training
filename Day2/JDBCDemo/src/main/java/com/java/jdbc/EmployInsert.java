package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {
	public static void main(String[] args) {
		int empno;
		double basic;
		String name,dept,design,gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No:");
		empno = sc.nextInt();
		System.out.println("Enter Employ Name:");
		name = sc.next();
		System.out.println("Enter Gender (MALE/FEMALE)");
		gender = sc.next();
		System.out.println("Enter The Department:");
		dept =  sc.next();
		System.out.println("Enter The Designation:");
		design = sc.next();
		System.out.println("Enter The Basic:");
		basic = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitepractice", "root","9337596800");
//			System.out.println("Database Connected...");
			
			String cmd = "Insert into Employ (empno,name,gender,dept,design,basic) values (?,?,?,?,?,?)";
			PreparedStatement pstm =conn.prepareStatement(cmd);
			pstm.setInt(1, empno);
			pstm.setString(2, name);
			pstm.setString(3, gender);
			pstm.setString(4, dept);
			pstm.setString(5, design);
			pstm.setDouble(6, basic);
			pstm.executeUpdate();
			System.out.println("*** Rescord Inserted ***");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

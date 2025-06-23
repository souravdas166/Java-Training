package com.java.phonepay.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.phonepay.dao.DaoImpl;
import com.java.phonepay.dao.DaoPhonepay;


public class PhonepayMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name");
		String user = sc.next();
		System.out.println("Enter the Password");
		String pwd = sc.next();
		
		DaoPhonepay db= new DaoImpl();
		try {
			int count = db.validate(user, pwd);
			if(count == 1) {
				System.out.println("Correct Details");
			}
			else {
				System.out.println("Incorrect Credentials...");
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

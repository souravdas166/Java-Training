package com.java.bankproject.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bankproject.dao.BankDao;
import com.java.bankproject.dao.BankDaoImpl;
import com.java.bankproject.model.Accounts;

public class CreateAccountMain {
	public static void main(String[] args) {
		Accounts accounts = new Accounts();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FirstName");
		accounts.setFirstName(sc.next());
		
		System.out.println("Enter Last Name");
		accounts.setLastName(sc.next());
		
		System.out.println("Enter City");
		accounts.setCity(sc.next());
		
		System.out.println("Enter State");
		accounts.setState(sc.next());
		
		System.out.println("Enter Amount");
		accounts.setAmount(sc.nextDouble());
		
		System.out.println("Enter CheqFacil(yes/no)");
		accounts.setCheqFacil(sc.next());
		
		System.out.println("Enter Account Type");
		accounts.setAccountType(sc.next());
		
		BankDao bd = new BankDaoImpl();
		try {
			bd.createAccount(accounts);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}

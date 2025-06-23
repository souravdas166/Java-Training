package com.java.phonepay.main;

import java.util.Scanner;

import com.java.phonepay.dao.DaoImpl;
import com.java.phonepay.dao.DaoPhonepay;

public class DebitMain {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter Your Username:");
		        String userName = sc.next();

		        System.out.println("Enter Your Password:");
		        String password = sc.next();

		        System.out.println("Enter The Mobile Number to send money:");
		        double mobno = sc.nextDouble();

		        System.out.println("Enter The Amount ");
		        double amt = sc.nextDouble();

		       
		        DaoPhonepay db = new DaoImpl();

		        try {
		
		            int result = db.debit(mobno, amt, userName, password);

		            
		            switch (result) {
		                case 1:
		                    System.out.println("Amount Is debted from your account");
		                    break;
		                case 0:
		                    System.out.println(" Mobile number not found.");
		                    break;
		                case -1:
		                    System.out.println(" Invalid credentials.");
		                    break;
		                case -2:
		                    System.out.println(" Insufficient balance.");
		                    break;
		                default:
		                    System.out.println(" Unknown error occurred.");
		            }
		        } catch (Exception e) {
		            System.out.println(" Error: " + e.getMessage());
		            e.printStackTrace();
		        } finally {
		            sc.close(); 
		        }
		    }
		

	}


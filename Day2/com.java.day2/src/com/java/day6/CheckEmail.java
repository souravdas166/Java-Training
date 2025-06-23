package com.java.day6;

import java.util.Scanner;

public class CheckEmail {
	public static void check(String Email) throws Invalidemail, InvalidUser {
		
		if(!Email.contains("@")) {
			throw new Invalidemail ("Email address is invalid it should contain @");	
		}
		int pos = Email.indexOf("@");
		String User = Email.substring(0, pos);
		if(User.length()>=5 && User.length()<12) {
			throw new InvalidUser("User name must Be within 6 -12 Character");
		}
		System.out.println("The Email address is" +Email );
	}
	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Email Address:");
		email = sc.next();
		try {
			check(email);
		} catch (Invalidemail | InvalidUser e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
}


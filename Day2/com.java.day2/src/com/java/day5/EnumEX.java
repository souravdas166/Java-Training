package com.java.day5;

import java.util.Scanner;

public class EnumEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Gender(Male/Female)");
		try {
			String input = sc.next();
			Gender gen = Gender.valueOf(input);
			System.out.println("Gender Entered By user is:" +gen);
		}
		catch (IllegalArgumentException e) {
		System.err.println("Enter the Gender The Format (Male/Female):");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
}

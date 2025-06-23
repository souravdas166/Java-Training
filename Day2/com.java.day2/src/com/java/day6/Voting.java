package com.java.day6;

import java.util.Scanner;

public class Voting {
	
	public static void check(int age) throws VotingEx{
		if(age<18) {
			throw new VotingEx("You Are Not Eligible:");
		}
		System.out.println("You Can vote");
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age:");
		age = sc.nextInt();
		try {
			check(age);
		} catch (VotingEx e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
}

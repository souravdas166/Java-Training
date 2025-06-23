package com.java.day6;

import java.util.Scanner;

public class Calculation {
	public static void calc(int a, int b) throws NegativeEx, NoZeroEx {
		if(a<0 || b<0) {
			throw new NegativeEx("Negative No Is Not Allowed");
		} else if (a==0 || b==0) {
			throw new NoZeroEx("Zero is Invalid");
		}
		int sum = a+b;
		System.out.println("Sum is " +sum);
		
		
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two No");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			calc(a,b);
		} catch (NegativeEx | NoZeroEx e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
}

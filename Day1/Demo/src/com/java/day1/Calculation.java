package com.java.day1;

/**
 * Program To perform calculator
 */

public class Calculation {
//
//	public void calc(int a, int b) {
//		int c = a+b;
//		System.out.println("Sum is" + c);
//		c= a-b;
//		System.out.println("Sub is"+ c);
//		c = a*b;
//		System.out.println("Mult is " + c);
//		
//	}
public void check(int n) {
	if(n>=0) {
		System.out.println(n+" Number Is Positive");
	}
	else {
		System.out.println(n+"Number is Negative");
	}
}



public static void main(String[] args) {
	
//	int a,b;
//	a=5;
//	b=6;
	int n =7;
	Calculation v = new Calculation();
//	v.calc( a, b);
	v.check(n);
	
}
		
	
}

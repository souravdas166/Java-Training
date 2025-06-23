package com.java.jdk8;

import java.util.Scanner;

public class CalcImpl {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no:");
		a= sc.nextInt();
		b = sc.nextInt();
//		c = sc.nextInt();
		
		ICalculation obj1 = (x,y) -> {return x+y;};
		ICalculation obj2 = (x,y) -> {return x-y;};
		ICalculation obj3 = (x,y) -> {return x*y;};
		
		System.out.println("Sum is" +obj1.calc(a, b));
		System.out.println("Sub is" +obj2.calc(a, b));
		System.out.println("Mul is" +obj3.calc(a, b));
					
	}
}

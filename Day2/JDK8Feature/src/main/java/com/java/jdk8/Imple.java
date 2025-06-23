package com.java.jdk8;

import java.util.Scanner;
class test{
public String low(String str) {
	String m = str.toLowerCase();
	return m;
}
public String up(String str1) {
	String n  = str1.toUpperCase();
	return n;
}
}
public class Imple {
	public static void main(String[] args) {
		String str, str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String to convert into Lower case");
		str= sc.nextLine();
		
		System.out.println("Enter The String to convert into Upper case");
		sc.nextLine();
		str1= sc.nextLine();
		test obj1 = new test();
		Istr1 s1 = obj1::low;
		System.out.println("Lower Case is" + " " +s1.toLower(str));
		Instr2 s2 = obj1::up;
		System.out.println("Upper Case is" + " " +s2.toUpper(str1));
		
	}
}

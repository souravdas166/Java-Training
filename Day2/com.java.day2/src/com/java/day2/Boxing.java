package com.java.day2;

public class Boxing {
	public static void main(String[] args) {
		int x = 12;
		String str =  " Hello";
		double p = 12.5;
		
		Object obj1 = x;
		Object obj2 = str;
		Object obj3 = p;
		
		int x1 = (Integer)obj1;
		String str2 = (String)obj2;
		double p1 = (Double)obj3;
		
		System.out.println(x1);
		System.out.println(str2);
		System.out.println(p1);
		
	}
}

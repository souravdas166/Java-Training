package com.java.Access;

public class Test {
	
	private int a =12;
	public int b =13;
	protected int c = 14;
	String str ="Hello";

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.str);
	}
	}

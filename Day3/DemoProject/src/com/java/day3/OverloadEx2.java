package com.java.day3;

public class OverloadEx2 {
	public int sum() {
		return 5;
	}
	
	public int sum (int x) {
		return x+5;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		OverloadEx2 b = new OverloadEx2();
		System.out.println("Method with zero argument" + b.sum());
		System.out.println("Method with One argument" +b.sum(5));
		System.out.println("Method with Two argument" +b.sum(5,6));
	}
}

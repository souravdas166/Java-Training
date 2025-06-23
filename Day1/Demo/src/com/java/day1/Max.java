package com.java.day1;

public class Max {

	public void check( int a, int b,int c) {
		
		if(a > b && a>c) {
			System.out.println(a+" is Greater");
		}
		else if(b>c) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(" is greater");
		}
	}
	public static void main(String[] args) {
		int a,b,c;
		a=3;
		b=1;
		c=2;
		Max t = new Max();
		t.check(a,b,c);
	}
}
 

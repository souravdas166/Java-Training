package com.java.day2;

public class Reverse_string {
	
	public char find(String str,int num )
	{
		char[]c = str.toCharArray();
		for(int i =0; i<c.length; i++) {
			if (c[i] == (char)num){
				return c[i];
			}
		}
		return '\0';
	}
 public static void main(String[] args) {
	String str = "Welcome to Java Programing Thank you All";
	Reverse_string ab = new Reverse_string();
	System.out.println(ab.find(str,10));
}
}

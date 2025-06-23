package com.java.day2;

public class Task {
public static void main(String[] args) {
	int n = 24;
	if(n%2 != 0 ) {
		System.out.println("Wired");
	}
	else {
		
		if(n>=2 && n<=5) {
			System.out.println("Not Wired");
		}
		
		else if(n>=6 && n<=20) {
			System.out.println("Wired");
		}
		else {
			System.out.println("Not Wired");
		}
		
	}
}
}

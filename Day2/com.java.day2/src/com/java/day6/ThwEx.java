package com.java.day6;

import java.util.Scanner;
public class ThwEx {
	public void show(int n) {
		if(n<0) {
			throw new ArithmeticException("  negative Nos Not Allowed");
		}else if(n==0) {
			throw new ArrayIndexOutOfBoundsException("Zero is Invalid Value...");
		}else {
			System.out.println("N value is" +n);
		}
	}


	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		ThwEx obj = new ThwEx();
		try {
			obj.show(n);
		} catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

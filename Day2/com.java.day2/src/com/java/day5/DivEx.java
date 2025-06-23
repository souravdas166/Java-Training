package com.java.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number:");
		try {
			int a= sc.nextInt();
			int b =sc.nextInt();
			int result = a/b;
			System.out.println("Division Of two Number: " +result);
		}catch (ArithmeticException e) {
			System.err.println("Give A as a big no and B as a small No to divide");
		}
		catch(InputMismatchException e) {
			System.err.println("Please Enter enter Integer Value: ");
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Program has to be execute:");
		}
		sc.close();
	}
}

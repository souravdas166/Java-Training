package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanfile {
	public static void main(String[] args) {
		File f = new File("C:/Java Training/Day2/EmployeProject/src/com/java/employ/model/Employ.java");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("C:/JavaTraining/Day2/EmployeProject/src/com/java/employ/model/Employ.java");
			int ch;
			while((ch=fin.read()) != -1){
				System.out.println((char)ch);
			}
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.files;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FOutput {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:/Java Training/Day2/EmployeProject/src/com/java/employ/model/Employ.java");
			FileOutputStream fout=new FileOutputStream("c:/Files/EmployNew.java");
			int ch;
			while((ch=fin.read())!=-1)
			{
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("file copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


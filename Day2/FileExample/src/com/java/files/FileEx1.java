package com.java.files;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		File f = new File("C:/Java Training/Day2/EmployeProject/src/com/java/employ/model//Employ.java");
		System.out.println("File Name " + f.getName());
		System.out.println("PArent" +f.getParent());
		System.out.println("Path" + f.getPath());
	}
}

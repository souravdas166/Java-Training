package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/Files/employ.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			Employ emp = (Employ)objin.readObject();
			System.out.println(emp);
			objin.close();
			fin.close();
		} catch (IOException ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

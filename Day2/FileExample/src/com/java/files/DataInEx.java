package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/Files/dataout.txt");
			DataInputStream din=new DataInputStream(fin);
			int x=din.readInt();
			String str=din.readUTF();
			boolean flag=din.readBoolean();
			double bas=din.readDouble();
			System.out.println("x value "+x);
			System.out.println("str value "+str);
			System.out.println("flag value "+flag);
			System.out.println("bas value "+bas);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 
		} 
	}
}

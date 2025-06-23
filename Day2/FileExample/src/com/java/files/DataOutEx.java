package com.java.files;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {
 public static void main(String[] args) {
	try {
		FileOutputStream fout = new FileOutputStream("c:/Files/dataout.txt");
		DataOutputStream dout  = new DataOutputStream(fout);
		
		dout.writeInt(23);
		dout.writeUTF("Sourav");
		dout.writeBoolean(true);
		dout.writeDouble(8888.9);
		dout.close();
		fout.close();
		System.out.println("Data Stored");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

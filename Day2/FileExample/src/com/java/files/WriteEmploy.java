package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
public static void main(String[] args) {
	Employ emp = new Employ (1,"Sourav","CSIT","Student",98567.0);
	try {
		FileOutputStream fout=new FileOutputStream("c:/files/object.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(emp);
		objout.close();
		fout.close();
		System.out.println("data saved");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

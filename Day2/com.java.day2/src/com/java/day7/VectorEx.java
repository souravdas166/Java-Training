package com.java.day7;

import java.util.Vector;

public class VectorEx implements Runnable{
	@Override
	public void run() {
		Vector<String> vec = new Vector<String>();
		vec.addElement("Premjeet");
		vec.addElement("Swati");
		vec.addElement("Nirmaly");
		vec.addElement("Anshu");
		vec.addElement("Usha");
		
		for(String c: vec) {
			System.out.println("Vector Data" +c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

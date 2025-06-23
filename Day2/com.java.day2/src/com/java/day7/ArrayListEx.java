package com.java.day7;

import java.util.ArrayList;

public class ArrayListEx implements Runnable {
	@Override
	public void run() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sourav");
		names.add("Nirmalya");
		names.add("Biswa");
		names.add("Sandhan");
		names.add("Abhishek");
		
		for(String c: names) {
			System.out.println("ArrayList Data" +c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

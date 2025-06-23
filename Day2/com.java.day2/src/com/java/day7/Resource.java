package com.java.day7;


public class Resource {
	synchronized void showMsg(String name) {
		System.out.println("Hello" + " " + name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How are you....");
	}
}

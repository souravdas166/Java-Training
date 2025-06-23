package com.java.day7;

public class ThreadEx {
	public static void main(String[] args) {
		Thread t1= new Thread(new First());
		Thread t2= new Thread(new Second());
		Thread t3= new Thread(new Third());
		
		t1.start();
		t2.start();
		t3.start();
	}
}

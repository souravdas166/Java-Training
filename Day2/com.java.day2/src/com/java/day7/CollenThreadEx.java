package com.java.day7;

public class CollenThreadEx {
	public static void main(String[] args) {
		Thread t1= new Thread(new First());
		Thread t2= new Thread(new Second());
		Thread t3= new Thread(new Third());
		
		
		Thread t4= new Thread(new ArrayListEx());
		Thread t5= new Thread(new VectorEx());
		Thread t6= new Thread(new TreesetEx());
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t5.start();
		t6.start();
		try {
			t6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.day7;

public class First extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<20 ; i+=2) {
			System.out.println("Even" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

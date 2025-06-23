package com.java.day7;



class exam implements Runnable{
	@Override
	public void run() {
		synchronized (this) {
			for(int i =0; i<= 10; i++) {
				if(i==5) {
					System.out.println("Thread is waiting at Index" + i);
				}
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class Thrwait {
	public static void main(String[] args) {
		exam ex = new exam();
		Thread t1 = new Thread(ex);
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized(ex) {
			System.out.println("MAin program Resuming Your Thread");
			ex.notify();
		}
	}
}
}
	

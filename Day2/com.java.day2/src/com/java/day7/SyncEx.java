package com.java.day7;

public class SyncEx {
	public static void main(String[] args) {
		Resource rcs = new Resource();
		Ravi r = new Ravi(rcs);
		Sandhan s = new Sandhan(rcs);
		Sourav sd = new Sourav(rcs);
		
		new Thread(r).start();
		new Thread(s).start();
		new Thread(sd).start();
	}
}

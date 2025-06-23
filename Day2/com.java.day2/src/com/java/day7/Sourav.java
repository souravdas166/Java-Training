package com.java.day7;

public class Sourav implements Runnable{
	Resource rc;
	Sourav(Resource rcs){
		this.rc = rcs ;
}
	@Override
	public void run() {
		rc.showMsg("Sourav");
		
	}
	}
	

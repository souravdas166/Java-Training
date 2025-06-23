package com.java.day7;

public class Ravi implements Runnable{
	
	
	Resource rc;
	Ravi(Resource rcs){
		this.rc = rcs ;
	}
	@Override
	public void run() {
		rc.showMsg("Ravi");
		
	}

}

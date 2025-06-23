package com.java.day7;

public class Sandhan implements Runnable {

	Resource rc;
	Sandhan(Resource rcs){
		this.rc = rcs ;
}
	@Override
	public void run() {
		rc.showMsg("Sandhan");
	}
}
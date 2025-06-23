package com.java.intf;

public class Muiltinhe implements Ione,Itwo {

	@Override
	public void email() {
		System.out.println("Email is prasanna@gmail.com");
		
	}

	@Override
	public void name() {
		System.out.println("Name is Prasanna....");
		
	}
	
	@Override
	public void phone() {
		System.out.println("9861201201");
		
	}
	
	public static void main(String[] args) {
		Muiltinhe c =new Muiltinhe();
		c.name();
		c.email();
		c.phone();
	}

	

}

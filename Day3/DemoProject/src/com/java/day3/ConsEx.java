package com.java.day3;

public class ConsEx {
	
	static {  // Static  constructor store in the heap in the heap there is Constant POOL
		System.out.println("Static Constructor");
	}
	ConsEx(){
	System.out.println("Instance Constructor");	
	}
	
	public static void main(String[] args) {
		
		ConsEx s = new ConsEx();
		
	}
}

package com.java.day3;

public class ConsOver {
	
	int a,b;
	ConsOver(){
		a=5;
		b=6;
	}
	
	ConsOver(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConsOver [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		ConsOver d = new ConsOver();
		System.out.println(d);
		ConsOver s = new ConsOver(12,24);
		System.out.println(s);
	}
	

}

package com.java.day3;

public class Employ {
	int empno;
	String name;
	double basic;
	
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}


	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.name = "Sourav";
		e1.empno = 1;
		e1.basic = 88834;
		
		Employ e2 = new Employ();
		e2.name = "Ram";
		e2.empno = 4;
		e2.basic = 88864;
		
		
		
		System.out.println(e1);
		System.out.println(e2);
	}
	
}

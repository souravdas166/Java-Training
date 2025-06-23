package com.java.day2;

public class Boxing_test {
	
	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		
		if(type.equals("Integer")) {
			int x = (Integer)ob;
			System.out.println("Integer Casting" +x);
		}
		if(type.equals("String")) {
			String x = (String)ob;
			System.out.println("String Casting"+x);
		}
		if(type.equals("Double")){
			double p = (Double)ob;
			System.out.println("Double Casting"+p);
		}
	}

	public static void main(String[] args) {
		
		int e = 12;
		String o ="Hello";
		double u = 12.5;
		Boxing_test f = new Boxing_test();
		f.show(e);
		f.show(o);
		f.show(u);
	}
}


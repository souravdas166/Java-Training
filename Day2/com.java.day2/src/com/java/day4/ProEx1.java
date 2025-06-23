package com.java.day4;
/**
 * Implementation Read- only property;
 */
public class ProEx1 {
	private int sno;
	private String name;
	public ProEx1(int sno, String name) {
		
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		ProEx1 obj = new ProEx1(1,"Abhishek");
		System.out.println("Sno" +obj.sno);
		System.out.println("Sname" +obj.getName());
	}
	
}

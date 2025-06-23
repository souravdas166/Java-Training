package com.java.day4;

public class ProEx2 {
	
	private int sno;
	private String sname;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "ProEx2 [sno=" + sno + ", sname=" + sname + "]";
	}
	public static void main(String[] args) {
		ProEx2 obj = new ProEx2();
		obj.setSno(7);
		obj.setSname("Sourav");
		System.out.println(obj);
	}
	
	

}

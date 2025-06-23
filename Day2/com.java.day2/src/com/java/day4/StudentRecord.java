package com.java.day4;

public class StudentRecord {
	int sid;
	String sname;
	String city;
	double cgp;
	
	public StudentRecord() {
		
	}
	public StudentRecord(int sid, String sname, String city, double cgp) {

		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "StudentRecord [sid=" + sid + ", sname=" + sname + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
//	public int compareTo(Object 0) {
//		Student tu = (Student)o;
//		return tu.name.compare
//	}
	
	
	
}

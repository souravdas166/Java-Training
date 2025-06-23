package com.java.day5;

public class Student implements Comparable<Student> {
	private String sname;
	private int sno;
	private String city;
	private double cgp;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCgp() {
		return cgp;
	}
	public void setCgp(double cgp) {
		this.cgp = cgp;
	}
	public Student(String sname, int sno, String city, double cgp) {
		
		this.sname = sname;
		this.sno = sno;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + ", city=" + city + ", cgp=" + cgp + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.sname.compareTo(o.sname);
	}
	
	
	
	
}

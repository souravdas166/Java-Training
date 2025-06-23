package com.java.day3;

public class EnumEx {
	private int empno;
	private String name;
	private Gender gender;
	private double basic;
	@Override
	public String toString() {
		return "EnumEx [empno=" + empno + ", name=" + name + ", gender=" + gender + ", basic=" + basic + "]";
	}
	
	public static void main(String[] args) {
		EnumEx obj = new EnumEx();
		obj.empno = 1;
		obj.name ="Sourav";
		obj.gender = Gender.Male;
		obj.basic = 56439;
		System.out.println(obj);
	}
	
}

package com.java.day3;

enum WeekDay {
	SUNDAY,MONDAY, //how to create string into enum:valueof()
}
public class WeekDays {
	public static void main(String[] args) {
		WeekDay wd=WeekDay.SUNDAY;
		System.out.println(wd);
		String str="SUNDAY";
		WeekDay wd1=WeekDay.valueOf(str);
		System.out.println(wd1);
	}
}

package com.java.day5;

import java.util.Calendar;

public class CalEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, 84);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 5);
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR, 3);
		System.out.println(cal.getTime());
	}
}

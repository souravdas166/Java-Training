package com.java.day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(sm.format(dt));
	}

}

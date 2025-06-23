package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		List emp = new ArrayList();
		emp.add(new Employ(1,"Zainab",99234.22));
		emp.add(new Employ(1,"Sourav",99238.22));
		emp.add(new Employ(1,"Swati",99236.22));
		emp.add(new Employ(1,"Abhishek",99237.22));
		
		System.out.println("Employ list:");
		for(Object ob: emp ) {
			Employ emps = (Employ)ob;
			System.out.println(emps);
		}
	}
}

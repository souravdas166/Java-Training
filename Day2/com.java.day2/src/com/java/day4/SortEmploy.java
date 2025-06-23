package com.java.day4;

import java.util.SortedSet;
import java.util.Comparator;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet name = new TreeSet(c);
		name.add(new Employ(1,"Zainab",99234.22));
		name.add(new Employ(1,"Sourav",99238.22));
		name.add(new Employ(1,"Swati",99236.22));
		name.add(new Employ(1,"Abhishek",99237.22));
		
		System.out.println("Employ List  ");
		for(Object ob: name ) {
			Employ emps = (Employ)ob;
			System.out.println(emps);
		}
	}
}

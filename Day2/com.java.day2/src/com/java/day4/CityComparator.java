package com.java.day4;

import java.util.Comparator;

public class CityComparator implements Comparator{
	
	public int compare(Object o1,Object o2) {
		StudentRecord Stud1 = (StudentRecord)o1;
		StudentRecord Stud2 = (StudentRecord)o2;
		return Stud1.city.compareTo(Stud2.city);
		
	}
}

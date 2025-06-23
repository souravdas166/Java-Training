package com.java.day4;

import java.util.Comparator;

public class CgpComapator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		StudentRecord stud1= (StudentRecord)o1;
		StudentRecord stud2=(StudentRecord)o2;
		if(stud1.cgp > stud2.cgp) {
		
	}
return -1;
}
}

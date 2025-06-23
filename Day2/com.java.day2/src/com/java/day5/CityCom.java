package com.java.day5;

import java.util.Comparator;

public class CityCom  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}

}

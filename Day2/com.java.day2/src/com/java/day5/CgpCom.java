package com.java.day5;

import java.util.Comparator;

public class CgpCom implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getCgp() > o2.getCgp()) {
		return 1;
	}else {
	return -1;
	}
	}
}

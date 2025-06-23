package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
		
		employList.add(new Employ(1, "Avesh" , 48234));
		employList.add(new Employ(2, "Sourav" , 48237));
		employList.add(new Employ(3, "Nirmalya" , 28254));
		employList.add(new Employ(4, "Sandhan" , 48243));
		employList.add(new Employ(5, "Swati" , 38246));
		employList.add(new Employ(6, "Ishani" , 48294));
		
		System.out.println("Sort Employ name-wise");
		Collections.sort(employList , (e1,e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		employList.forEach(System.out::println);
	}
}

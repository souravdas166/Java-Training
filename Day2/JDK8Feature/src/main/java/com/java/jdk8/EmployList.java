package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class EmployList {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		
		employList.add(new Employ(1, "Avesh" , 48234));
		employList.add(new Employ(2, "Sourav" , 48237));
		employList.add(new Employ(3, "Nirmalya" , 48254));
		employList.add(new Employ(4, "Sandhan" , 48243));
		employList.add(new Employ(5, "Swati" , 48246));
		employList.add(new Employ(6, "Ishani" , 48294));
		
		System.out.println("Employ List is:");
		
		employList.forEach(System.out::println);
		
//		employList.forEach(x -> {
//			System.out.println(x);
//		});
	}
}

package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List data = new ArrayList();
		data.add(new Integer(24));
		data.add(new Integer(25));
		data.add(new Integer(10));
		data.add(new Integer(02));
		
		int sum =0;
		for(Object ob:data) {
			int x = (Integer)ob;
			sum+=x;
		}
		System.out.println("Sum is:" +sum);
	}

}

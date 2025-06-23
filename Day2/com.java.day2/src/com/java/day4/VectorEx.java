package com.java.day4;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector vec = new Vector(3,2);
		
		System.out.println("Size" +vec.size());
		System.out.println("Capacity" +vec.capacity());
		vec.add("Usha");
		vec.add("Sourav");
		vec.add("Sandhan");
		System.out.println("Size" +vec.size());
		System.out.println("Capacity" +vec.capacity());
		System.out.println(vec);
		vec.add("Zainab");
		System.out.println("Size" +vec.size());
		System.out.println("Capacity" +vec.capacity());
		vec.add("Swati");
		System.out.println("Size" +vec.size());
		System.out.println("Capacity" +vec.capacity());
		vec.add("Ravi");
		System.out.println("Size" +vec.size());
		System.out.println("Capacity" +vec.capacity());
		System.out.println(vec);
		
		
		
	}
}

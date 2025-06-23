package com.java.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List name = new ArrayList();
		name.add("Sourav");
		name.add("Abhishek");
		name.add("Anshu");
		name.add("Sandhan");
		name.add("Satya");
		System.out.println("Names are:");
		for(Object ob: name) {
			System.out.println(ob);
		}
		
		name.add(2,"Ravi");
		System.out.println("Name After insert Operation:");
		for(Object ob: name) {
			System.out.println(ob);
		}
		
		name.set(2, "Ravikant");
		System.out.println("Names After updation");
		for(Object ob: name) {
			System.out.println(ob);
		}
		
		name.remove("Satya");
		System.out.println("Name After Removig:");
		for(Object ob: name) {
			System.out.println(ob);
		}
		
		Collection.So
		
	}
}

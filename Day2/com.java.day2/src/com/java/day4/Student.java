package com.java.day4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Student {
	public static void main(String[] args) {
//		Comparator c = new CityComparator();
		Comparator d = new CgpComapator();
		 SortedSet name = new TreeSet(d);
		 name.add(new StudentRecord(1,"Sourav", "Balasore", 8.50));
		 name.add(new StudentRecord(2,"Ravi", "Bbsr", 8.40));
		 name.add(new StudentRecord(3,"Subham", "Cuttack", 8.19));
		 name.add(new StudentRecord(4,"Ananta", "Bhadrak", 8.70));
		 name.add(new StudentRecord(5,"Priti", "Kendrapada", 8.67));
		 name.add(new StudentRecord(6,"Sandhan", "Sonepur", 8.55));
		 name.add(new StudentRecord(7,"Aryan", "Dhenkanal", 8.65));
		 name.add(new StudentRecord(8,"Swaraj", "Angul", 8.76));
		 name.add(new StudentRecord(9,"Shree", "Khorda", 8.99));
		 

			System.out.println("Student List  ");
			for(Object ob: name ) {
				StudentRecord stu = (StudentRecord)ob;
				System.out.println(stu);
			}
	}
}

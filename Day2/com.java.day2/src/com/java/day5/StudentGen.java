package com.java.day5;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class StudentGen {
	public static void main(String[] args) {
//		Comparator  c = new CgpCom();
		Comparator d = new CityCom();
		SortedSet<Student> we = new TreeSet<Student>(d);
		we.add(new Student("Sourav", 1 ,"Balasore", 8.50));
		we.add(new Student("Ravi",2, "Bbsr", 8.40));
		 we.add(new Student("Subham",3, "Cuttack", 8.19));
		 we.add(new Student("Ananta",4, "Bhadrak", 8.70));
		 we.add(new Student("Priti",5, "Kendrapada", 8.67));
		 we.add(new Student("Sandhan",6, "Sonepur", 8.55));
		 we.add(new Student("Aryan",7, "Dhenkanal", 8.65));
		 we.add(new Student("Swaraj",8,"Angul", 8.76));
		 we.add(new Student("Shree", 9,"Khorda", 8.99));
		 
		 for(Student st : we) {
			 System.out.println(st);
		 }
	}
}

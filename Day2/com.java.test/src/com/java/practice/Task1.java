package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task1 {
	
	
	public static void main(String[] args) {
		 List<String> original = new ArrayList<>();
		 List<String> vowel = new ArrayList<>();
		 List<String> consta = new ArrayList<>();
		 
		 
		 original.add("hgb");
		 original.add("sdf");
		 original.add("ravi");
		 original.add("rts");
		 
		 
		 for(int i =0;i<original.size();i++) {
			 System.out.println(original.get(i));
			 if(validate(original.get(i))) {
				 vowel.add(original.get(i));
			 }
			 else {
				 consta.add(original.get(i));
			 }
		 }
		 
		 System.out.println("List That Contain vowel in the name" + vowel);
		 System.out.println("List that does contain cowel in the name" + consta);
	}
		 public static boolean validate(String original) {
			 
			
			for(int i =0; i< original.length();i++) {
				
				char check = original.charAt(i);
				if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' || check == 'A' ||check == 'E' ||check == 'I' ||check == 'O' ||check == 'U' ) {
					return true;
				}
		 }
			return false;
		 }
			public static boolean validat2(String original) {
				HashMap<Character, Integer> check = new HashMap<Character, Integer>();
				check.put('a',1);
				check.put('e',1);
				check.put('i', 1);
				check.put('o', 1);
				check.put('u', 1);
				
				for(int i =0; i<original.length();i++) {
					if(check.containsKey(original.charAt(i))){
						return true;
					}
			}
				return false;
			
	}
}

package com.java.day2;

public class Palindrome {
 static boolean check(String str) {
	 int left =0;
	 int right = str.length()-1;
	 
	 while(left<right) {
		 if(str.charAt(left) != str.charAt(right))
			 return false;
		 
		 left++;
		 right--;
	 }
	 return true;
 }
 public static void main(String[] args) {
	String str= "Madam is Very Cool";
	String []word = str.split("");
	
	for(String m: word) {
		if(check(m)){
			System.out.print(m);
		}
	}
}
}

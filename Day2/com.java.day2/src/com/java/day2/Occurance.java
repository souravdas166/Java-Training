package com.java.day2;

import java.util.Arrays;

public class Occurance {
public static void main(String[] args) {
	String word = "minimum";
	int[] arr = new int[3];
	int[] freq = new int[256];

	
	for(char c: word.toCharArray()) {
		freq[c]++;
	}
	
	arr[0] = freq['m'];
	arr[1]= freq['i'];
	arr[2] = freq['n'];
	Arrays.sort(arr);
	for(int a: arr) {
		System.out.println(a);
	}
//	int secondminfre = arr[1];
////	System.out.println(secondminfre);
//	
//	char secondminchar =' ';
//	
//	if(secondminfre == freq['i']) {
//		secondminchar ='i';
//	} else if(secondminfre == freq['m']) {
//		secondminchar ='m';
//	} else if (secondminfre == freq['n']) {
//		secondminchar ='n';
//	}
//	
//	System.out.println(secondminchar);
}
}

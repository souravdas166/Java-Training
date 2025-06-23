package com.java.exam;

import java.util.Scanner;

public class Question1 {
	public static void test(String str) {
		
		String rspace = str.trim().replace("\\s+", " ");
		String[] wd = rspace.split(" ");
		
		String[] finalword = new String[wd.length];
		
		int finalcount = 0;
		int criCount =0;
		
		for(int i =0;i<wd.length;i++) {
			String word = wd[i];
			String lowerword = word.toLowerCase();
			
			int index = lowerword.indexOf("cri");
			while(index!= -1) {
				criCount++;
				index = lowerword.indexOf("cri" , index+1);
			}
			
			if(!lowerword.contains("cri")) {
				finalword[finalcount] = word;
				finalcount++;
			}
			
		}
		System.out.println("Output in Alternate Uppercase");
		
		for(int i =0;i<finalcount;i++) {
			if(i%2 ==0) {
				System.out.println(finalword[i].toUpperCase() + " ");
			}
			else {
				System.out.println(finalword[i].toLowerCase() + " ");
			}
		}
		
		System.out.println("No of cri occured" +criCount);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str= sc.nextLine();
		System.out.println("Enter The String is: " +str);
		test(str);
		
	}
}

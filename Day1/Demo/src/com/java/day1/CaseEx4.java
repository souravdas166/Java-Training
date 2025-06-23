package com.java.day1;

public class CaseEx4 {
	public String mentor(String name) {
		String result = switch(name) {
		case "Raj" ,"Keerthana" ->{
		yield"Sumanth";}
		
		case "Pavan", "Prajwal" ->{
		yield "Siddharth";}
		
		case "Santosh", "Vidya" -> {
		yield"Murali";}
		
		case"Sekhar", "Jhon" ->{
		yield "Gayathri";}
		
		default -> { 
			yield "Sourav";
			} };
		
		return result;
		
	}
	
	public static void main(String[] args) {
		CaseEx4 b =new CaseEx4();
		System.out.println(b.mentor("Raj"));
	}
}
		

package com.java.day2;

public class Perfectno {

	public void show(int num) {
	int count = 0;
	int add =0;
	for(int i =1; i<num ;i++) {
		
		add =0;
		
		for(int j = i; j<i;j++) {
			if(j %i ==0) {
				add = j
		}
		
		 add = i +i;
		System.out.println(add);
	}
}
public static void main(String[] args) {
	int num = 6;
	Perfectno sd= new Perfectno();
	sd.show(num);
}
}

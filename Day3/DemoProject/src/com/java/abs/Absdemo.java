package com.java.abs;

public class Absdemo {
	public static void main(String[] args) {
		Training[] arr = new Training[] {new Satya(), new Sourav(), new Ravi()};
		for(Training c: arr) {
			c.name();
			c.email();
		}
	}
}

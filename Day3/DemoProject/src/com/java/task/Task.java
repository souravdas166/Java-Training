package com.java.task;

public class Task {
	
	private int hours;
	private int minutes;
	
	public Task(int hrs, int mins){
		this.hours = hrs;
		this.minutes= mins;
	}
	
	public TimeZone add(TimeZone other) {
		int totalmin = this.mintues + other.minutes;
		int totalhrs = this.hours + other.hours + totalmin /60;
		totalMin %=60;
		return new TimeZone(totalHrs,totalMin);
	}
	
	public void display() {
		System.out.println(hours + "hrs" + minutes + "min");
	}
	
	public static void main(String[] args) {
		TimeZone T1 = new TimeZone(3,40);
		TimeZone T2 = new TimeZone(2,30);
		
		TimeZone sum = t1.add(t2);
	}

}

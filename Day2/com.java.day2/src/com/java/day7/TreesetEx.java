package com.java.day7;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetEx implements Runnable{
	@Override
	public void run() {
		SortedSet<String> tree = new TreeSet<String>();
		tree.add("Zainab");
		tree.add("Purnendu");
		tree.add("Ravi");
		tree.add("Subham");
		tree.add("Pratyush");
		tree.add("Zainab");
		tree.add("Purnendu");
		tree.add("Ravi");
		tree.add("Subham");
		tree.add("Pratyush");
		tree.add("Zainab");
		tree.add("Purnendu");
		tree.add("Ravi");
		tree.add("Subham");
		tree.add("Pratyush");
		
		
		for(String c: tree) {
			System.out.println("Treeset Data" +c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

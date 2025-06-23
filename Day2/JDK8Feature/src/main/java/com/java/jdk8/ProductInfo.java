package com.java.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	public static void main(String[] args) {
		 List<Product> list=new ArrayList<>();
	        list.add(new Product(1,"Samsung A5",17000f));
	        list.add(new Product(3,"Iphone 6S",65000f));
	        list.add(new Product(2,"Sony Xperia",25000f));
	        list.add(new Product(4,"Nokia Lumia",15000f));
	        list.add(new Product(5,"Redmi4 ",26000f));
	        list.add(new Product(6,"Lenevo Vibe",19000f));
	        
	        //1) Display all products
	        
	        System.out.println("Display all product");
	        
	        list.forEach(x -> {
	        	System.out.println(x);
	        });
	        
//	        2) Display Sort By Product Name
	        
	       System.out.println(" Display Sort By Product Name");
	       Collections.sort(list,(p1,p2) -> {
	    	   return p1.getName().compareTo(p2.getName());
	       });
	       
	       list.forEach(System.out::println);
	       
//	       3) Display sort by Price
	       System.out.println(" Display sort by Price");
	       Collections.sort(list,(r1,r2) -> {
	    	   return (r1.getPrice() > r2.getPrice()? 1:-1); 
	       });
	       list.forEach(System.out::println);
	       
//	       5) Display max/min priced items 
	       System.out.println("Display max/min priced items ");
	      Product mx = list.stream().max((m1,m2) -> 
	       m1.getPrice() > m2.getPrice() ? 1:-1).get();
	      
	      System.out.println("Max Product Price" +mx);
	      
	      Product mn = list.stream().min((m1,m2) -> 
	       m1.getPrice() > m2.getPrice() ? 1:-1).get();
	      
	      System.out.println("Min Product Price" +mn);
	}
	
}

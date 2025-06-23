package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class FilteredExample1 {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		
		employList.add(new Employ(1, "Avesh" , 48234));
		employList.add(new Employ(2, "Sourav" , 48237));
		employList.add(new Employ(3, "Nirmalya" , 28254));
		employList.add(new Employ(4, "Sandhan" , 48243));
		employList.add(new Employ(5, "Swati" , 38246));
		employList.add(new Employ(6, "Ishani" , 48294));
		
		System.out.println("Employe list Record are whose sal > 40000");
		employList.stream().filter( x -> 
		x.getBasic() > 40000).forEach(System.out::println);
		
		System.out.println("Whose name Start with s");
		employList.stream().filter( x -> 
		x.getName().startsWith("S")).forEach(System.out::println);
}
}

package com.java.intf;

public class IntfEx {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {new Satya(), new Sourav(), new Ravi()};
		for(ITraining c: arr) {
			c.name();
			c.email();
}
}
}
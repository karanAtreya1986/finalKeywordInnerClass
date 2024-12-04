package com.learnings;

public class Finalkeywordexample {
	
	//Variables inside interface are final by default.
	
	//this is perfect way to declare and define final keyword.
	final String pancardnumberString="qwewqewqe13123123!#!@#123";
	
	public static void main(String[] args) {
		
		Finalkeywordexample f1=new Finalkeywordexample();
		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

package com.learnings;

public class FinalPlusStatic {
	
	final static String pancardnumberString="qwewqewqe13123123!#!@#123";
	
	public static void main(String[] args) {
		
		FinalPlusStatic f1=new FinalPlusStatic();
		
		//we only get warning to access static in this way using objects
		//but code will work.
		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

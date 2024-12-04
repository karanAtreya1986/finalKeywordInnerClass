package com.learnings;

public class Finalstaticreinitialise {

	final static String pancardnumberString;

	static {
		pancardnumberString = "qwewqewqe13123123!#!@#123";
	}

	// compile error when trying to reinitialise final static
	// The final field Finalstaticreinitialise.pancardnumberString cannot be
	// assigned
	// Reinitialize not allowed for final variables. Final for constant variables.

	// when we run the program, the older value of final will be displayed
	// though it shows error now
	static void display() {
		pancardnumberString = "hello";
	}

	public static void main(String[] args) {

		Finalstaticreinitialise f1 = new Finalstaticreinitialise();

		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

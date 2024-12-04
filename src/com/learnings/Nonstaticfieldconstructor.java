package com.learnings;

public class Nonstaticfieldconstructor {

	final String pancardnumberString;

	// to initialise final non static variable use constructor.
	Nonstaticfieldconstructor() {
		pancardnumberString = "ewrwer234234@$@#$";
	}

	public static void main(String[] args) {

		Nonstaticfieldconstructor f1 = new Nonstaticfieldconstructor();

		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

package com.learnings;

public class Nonstaticfieldstaticblock {

	final String pancardnumberString;

	//when we have final non static variable
	//we cannot initialise using static block
	//compile error - Cannot make a static reference to the non-static field pancardnumberString
	static {
		pancardnumberString="324234WRWER@#$@#";
	}

	public static void main(String[] args) {

		Nonstaticfieldstaticblock f1 = new Nonstaticfieldstaticblock();

		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

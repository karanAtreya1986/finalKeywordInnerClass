package com.learnings;

public class Staticfieldstaticblock {

	final static String pancardnumberString;

	// to initialise final static field use static block

	static {
		pancardnumberString = "qrewre@#$@#$@#$#@$24234324";
	}

	public static void main(String[] args) {

		Staticfieldstaticblock f1 = new Staticfieldstaticblock();

		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

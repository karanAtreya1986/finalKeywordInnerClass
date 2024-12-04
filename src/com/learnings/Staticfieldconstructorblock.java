package com.learnings;

public class Staticfieldconstructorblock {

	final static String pancardnumberString;

	//when we try to assign value to final static variable in constructor
	//we get compile error
	//The final field Staticfieldconstructorblock.pancardnumberString cannot be assigned
	public Staticfieldconstructorblock() {
		pancardnumberString="qewrewr23213!@#@!#";
	}

	public static void main(String[] args) {

		Staticfieldconstructorblock f1 = new Staticfieldconstructorblock();

		String pancardnumberString2 = f1.pancardnumberString;
		System.out.println(pancardnumberString2);
	}

}

package com.learnings;

public class Staticinnerclass {

	// only for static members

	private static int data = 10;

	public static class Innerclass {
		void display() {
			System.out.println("data value is " + data);
		}
	}

	public static void main(String[] args) {

		// see the difference in creating objects.
		// see how to access inner class in main.
		Staticinnerclass.Innerclass object1 = new Staticinnerclass.Innerclass();
		object1.display();
	}

}

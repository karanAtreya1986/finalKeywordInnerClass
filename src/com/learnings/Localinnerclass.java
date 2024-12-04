package com.learnings;

public class Localinnerclass {

	private int data = 10;

	// this is method local inner class inside another method.
	// see how to access it
	// create object inside method itself and call the method

	// then in main program we need to create object of outer and call the outer
	// method

	// create class inside method.
	void display() {
		class Innerclass {
			void message() {
				System.out.println("data is " + data);
			}
		}
		// create object of inner class.
		Innerclass ic = new Innerclass();
		ic.message();
	}

	public static void main(String[] args) {
		Localinnerclass l1 = new Localinnerclass();
		l1.display();
	}

}

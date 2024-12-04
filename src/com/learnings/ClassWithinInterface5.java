package com.learnings;

interface Message547 {
	class Abcd {
		void display() {
			System.out.println("class within the interface");
		}
	}
}

public class ClassWithinInterface5 implements Message547 {

	void display() {
		System.out.println("class within the interface");
	}

	public static void main(String[] args) {

		// compile error - Type mismatch: cannot convert from ClassWithinInterface5 to
		// Message547.Abcd
		// we cant access this way also.
		Message547.Abcd object1 = new ClassWithinInterface5();

		object1.display();
	}
}

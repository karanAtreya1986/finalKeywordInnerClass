package com.learnings;

interface Message545 {
	class Abcd {
		void display() {
			System.out.println("class within the interface");
		}
	}
}

public class ClassWithinInterface4 implements Message545 {

	public static void main(String[] args) {
		ClassWithinInterface4 object1 = new ClassWithinInterface4();
		// we dont get the method from inner class here.
		// compile error - The method display() is undefined for the type
		// ClassWithinInterface4
		object1.display();
	}
}

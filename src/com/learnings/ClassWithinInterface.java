package com.learnings;

interface Message2 {
	class Abcd {
		void display() {
			System.out.println("class within the interface");
		}
	}
}

public class ClassWithinInterface implements Message2 {

//	void display() {
//		System.out.println("class within the interface");
//	}

	// since interface does not have any method
	// compile error when we use override annotation.
	// The method display() of type ClassWithinInterface must override or implement
	// a supertype method
	
	//if interface had a method called as display() then below code will work.
	@Override
	void display() {
		System.out.println("class within the interface");
	}

	public static void main(String[] args) {
		ClassWithinInterface object1 = new ClassWithinInterface();
		object1.display();
	}
}

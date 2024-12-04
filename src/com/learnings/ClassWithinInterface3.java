package com.learnings;

interface Message4 {
	class Abcd {
		void display() {
			System.out.println("class within the interface");
		}
	}

	public void display();
}

public class ClassWithinInterface3 implements Message4 {

//	void display() {
//		System.out.println("class within the interface");
//	}

	// since interface does not have any method
	// compile error when we use override annotation.
	// The method display() of type ClassWithinInterface must override or implement
	// a supertype method

	// if interface had a method called as display() then below code will work.
	// if access modifier is not given in interface, it will throw compile error.
	// Cannot reduce the visibility of the inherited method from Message4

	// change method to public in interface.
	// change method to public here also in overridden area.
	@Override
	public void display() {
		System.out.println("class within the interface");
	}

	public static void main(String[] args) {
		ClassWithinInterface3 object1 = new ClassWithinInterface3();
		object1.display();
	}
}

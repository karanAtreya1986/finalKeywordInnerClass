package com.learnings;

interface Message3 {
	class Abcd {
		void display() {
			System.out.println("class within the interface");
		}
	}
}

public class ClassWithinInterface2 implements Message3 {

	// we can override the methods of class directly without override keyword.
	//this is like a new method itself
	
	void display() {
		System.out.println("over write method class within the interface");
	}

	public static void main(String[] args) {
		ClassWithinInterface2 object1 = new ClassWithinInterface2();
		object1.display();
	}
}

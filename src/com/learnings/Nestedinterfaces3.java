package com.learnings;

interface Outer2 {
	void abc();

	interface Inner2 {
		void xyz();
	}
}

//see how to call inner interfaces.
public class Nestedinterfaces3 implements Outer2.Inner2 {

	// we have to mandatorily implement inner interface methods because we have used
	// that in implements.

	@Override
	public void xyz() {
		System.out.println("inner interface called");
	}

	public void test() {
		System.out.println("i am from main class");
	}

	public static void main(String[] args) {
		// see how to declare objects of inner interface
		// how to access inner interface.

		// note - if there are other methods in class, those cant be accessed with this
		// object because this is only for inner ones.
		Outer2.Inner2 object1 = new Nestedinterfaces3();
		object1.xyz();

		// we have to create objects of the class and then access class methods
		// individually.
		Nestedinterfaces3 n1 = new Nestedinterfaces3();
		n1.test(); // this works

	}

}

package com.learnings;

interface Outer1 {
	void abc();

	interface Inner1 {
		void xyz();
	}
}

//see how to call inner interfaces.
public class Nestedinterfaces2 implements Outer1.Inner1 {

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
		Outer1.Inner1 object1 = new Nestedinterfaces2();
		object1.xyz();

		object1.test(); // not able to access the class methods.
	}

}

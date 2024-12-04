package com.learnings;

interface Outer {
	void abc();

	interface Inner {
		void xyz();
	}
}

//see how to call inner interfaces.
public class Nestedinterfaces implements Outer.Inner {

	// we have to mandatorily implement inner interface methods because we have used
	// that in implements.

	@Override
	public void xyz() {
		System.out.println("inner interface called");
	}

	public static void main(String[] args) {
		// see how to declare objects of inner interface
		// how to access inner interface.

		// note - if there are other methods in class, those cant be accessed with this
		// object because this is only for inner ones.
		Outer.Inner object1 = new Nestedinterfaces();
		object1.xyz();
	}

}

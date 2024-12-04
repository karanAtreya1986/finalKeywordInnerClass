package com.learnings;

public class OuterClassImplementingInterfaceInsideAnotherClass implements InterfaceWithinClass.Message {

	@Override
	public void display() {
		System.out.println("interface within class is called");
	}
	
	public static void main(String[] args) {
		OuterClassImplementingInterfaceInsideAnotherClass object1=new OuterClassImplementingInterfaceInsideAnotherClass();
		object1.display();
	}

}

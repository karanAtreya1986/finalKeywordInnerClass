package com.learnings;

abstract class Person {
	abstract void name();
}

public class Anonymousinnerclass {

	public static void main(String[] args) {

		// create object of class and define the method when creating object itself.
		// no name of class or nowhere class is mentioned
		Person p1 = new Person() {
			void name() {
				System.out.println("abcde213234@$@#$");
			}
		};
		p1.name();
	}

}

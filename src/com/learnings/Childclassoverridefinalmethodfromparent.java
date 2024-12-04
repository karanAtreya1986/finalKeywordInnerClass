package com.learnings;

public class Childclassoverridefinalmethodfromparent extends Parentclassfinalmethod {
	
	//compile error when overriding final method.
	//Cannot override the final method from Parentclassfinalmethod
//	void display() {
//		System.out.println("hi i am final method in parent class");
//	}
	
	//even annotations wont help.
	//compile error - 
	//Cannot override the final method from Parentclassfinalmethod
	@Override
	void display() {
		System.out.println("hi i am final method in parent class");
	}


}

package com.learnings;

public class Howinnerclassworks2 {
	
	private int data = 10;
	
	
	//member inner class
	//make the inner class public and it still works
	public class Innerclass{
		void display() {
			System.out.println("data from outer class is " + data);
		}
	}
	
	public static void main(String[] args) {
		
		//see how to access inner class
		
		Howinnerclassworks2 h1=new Howinnerclassworks2();
		Howinnerclassworks2.Innerclass inobject=h1.new Innerclass();
		inobject.display();
	}

}

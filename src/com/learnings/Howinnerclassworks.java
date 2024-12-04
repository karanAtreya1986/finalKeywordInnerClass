package com.learnings;

public class Howinnerclassworks {
	
	private int data = 10;
	
	
	//member inner class
	class Innerclass{
		void display() {
			System.out.println("data from outer class is " + data);
		}
	}
	
	public static void main(String[] args) {
		
		//see how to access inner class
		
		Howinnerclassworks h1=new Howinnerclassworks();
		Howinnerclassworks.Innerclass inobject=h1.new Innerclass();
		inobject.display();
	}

}

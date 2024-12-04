package com.learnings;

class Abc{
	interface Message729{
		void display();
	}
}

	public class InterfaceWithinClassInOneClass implements Abc.Message729{

		@Override
		public void display() {
			System.out.println("interface within class in one program");
		}
		
		public static void main(String[] args) {
			//another way to call the inner
			Abc.Message729 object1=new InterfaceWithinClassInOneClass();
			object1.display();
		}
		
	}

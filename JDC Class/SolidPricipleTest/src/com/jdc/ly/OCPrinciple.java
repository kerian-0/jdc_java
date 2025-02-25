package com.jdc.ly;

public class OCPrinciple {
	
	public static void main(String[] args) {
		Computer com=new Computer();
		com.useStandardKeyboard();
		
		Laptop lap=new Laptop();
		lap.useWirelessKeyboard();
		lap.useStandardKeyboard();
	}

}
//open for extension
//close for modification
 

class Computer{
	
	void useStandardKeyboard() {
		System.out.println("Standart keyboard");
	}
	
	
	
}

class Laptop extends Computer{
	//after finishing the project,the client asked to us a new keyboard
		//break ocp
		void useWirelessKeyboard() {
			
		}
}

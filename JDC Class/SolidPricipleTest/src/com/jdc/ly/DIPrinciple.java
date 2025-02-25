package com.jdc.ly;

public class DIPrinciple {
//don't use every method that written ,use if you need to use
	public static void main(String[] args) {
		//high-level module
		WirelessKeyboard standardKeyboard=new WirelessKeyboard();
		standardKeyboard.type();
	}
}
class WirelessKeyboard implements Keyboard{
	//low-level module
	public void type() {
		System.out.println("Using Wireless keyboard for typing");
	}
}
class StadardKeyboard implements Keyboard{
	//low-level module
	public void type() {
		System.out.println("Usin Standard keyboard for typing");
	}
}
//Dependency Inversion Principle
interface Keyboard{
	void type();
}

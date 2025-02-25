package com.jdc.ly;

public class LSPrinciple {
   
	public static void main(String[] args) {
		Flyable bird=new Bird();
		bird.fly();
		
		//boomb crash
		Flyable penguine=new Penguin();
		penguine.fly();
	}
}

interface Flyable{
	void fly();
}
class Bird implements Flyable{
	public void fly() {
		System.out.println("Bitd is flying");
	}
}
///Penguin is a bird but it cannot fly
/////break Liskov substition Principle
class Penguin implements Flyable{
	public void fly() {
		System.out.println("Penguin is flying");
	}
}
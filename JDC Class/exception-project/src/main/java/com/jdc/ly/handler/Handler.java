package com.jdc.ly.handler;

public class Handler {

	private Person person = new Person();
	private int count = 1;

	public Handler() {
		super();
	}

	public void useName() {
		try {
			person.setName("John Doe");
			System.out.println(person.getName());
		} catch (NullPointerException e) {
			System.out.println("This is NullpointerException because there is no person object");
		}

	}

	public void useAge() {
		try {
			person.setAge(20);
			int age = dividedByZero(person.getAge());
			System.out.println(age);
		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticException because any number can't divided by zero");
		}
	}

	// stack over flow

	public void recursive() {
		try {
			if (count > 0) {
				System.out.println("recursive : " + count);
				count++;
				recursive();
			}
		} catch (StackOverflowError e) {
			System.out.println("This is StackOverflow error");
		}
	}

	private int dividedByZero(int age) {
		return age / 0;
	}

}

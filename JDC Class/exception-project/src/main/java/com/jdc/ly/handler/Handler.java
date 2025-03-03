package com.jdc.ly.handler;

public class Handler {

	private Person person=new Person();

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
		person.setAge(20);
		int age = dividedByZero(person.getAge());
		System.out.println(age);
	}

	public void recursive() {
		if (person.getAge() > 0) {
			recursive();
		}
	}

	private int dividedByZero(int age) {
		return age;
	}

}

package com.jdc.ly.seal;

public class Main {
	public static void main(String[] args) {

	}
}

final class Student extends School {

}

record Staff(int id, String name) implements Cashier {
}

final class Employee implements Cashier {
}

non-sealed class Teacher extends School {
}

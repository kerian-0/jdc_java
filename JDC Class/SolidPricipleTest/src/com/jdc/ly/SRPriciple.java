package com.jdc.ly;

public class SRPriciple {
	public static void main(String[] args) {
		User user = new User();
		user.setName("John");
		user.saveToDb();
		System.out.println(user.getName());

	}
}
 class User {

	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
  
	//should not have in User
	//break Single responsibility principle
	void saveToDb() {
		System.out.println("Save to db !");

	}

}


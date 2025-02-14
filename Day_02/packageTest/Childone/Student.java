package Childone;

public class Student{
		String name;
		int age;
	

	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public void showStudent(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		}

	public static void doSomething(){
		System.out.println("Do Something");
	 }
	}

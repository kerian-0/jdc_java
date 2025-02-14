
package employee_reg.dto;
public class Employee{
	private static String name;
	private static int age;
	private static int id;

	public Employee(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}

	public static String getName(){
		return name;
	}
	public static int getAge(){
		return age;
	}
	public static int  getId(){
		return id;
	}
}
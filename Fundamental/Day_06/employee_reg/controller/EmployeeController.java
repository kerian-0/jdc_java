package employee_reg.controller;
import employee_reg.dto.Employee;
import java.io.BufferedReader;
import static employee_reg.services.EmployeeServices.*;
import java.io.InputStreamReader;
import java.io.IOException;



public class EmployeeController{

	private static BufferedReader br;

	public  EmployeeController(){
              br=new BufferedReader(new InputStreamReader(System.in));
	}


	public static void createEmployee() throws IOException{


		String confirm="";

		do{
         System.out.print("Enter Employee Name: ");
         String name=br.readLine();
         System.out.println("Enter Employee Age: ");
         int age=Integer.parseInt(br.readLine());
         System.out.println("Enter Employee Id: ");
         int id=Integer.parseInt(br.readLine());

         Employee ep=new Employee(name,age,id);
         addEmployee(ep);
         System.out.print("Do you want to add again ? /y: ");
         confirm=br.readLine();

		}while("y".equals(confirm));
	}

	public static void showEmployee(){
		for (Employee epp: getEmployee()){
						System.out.println("My Name is " +epp.getName() +" My age is "+epp.getAge() + " My roll is " + epp.getId());

		}
	}
	
}
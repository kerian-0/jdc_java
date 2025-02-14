package employee_reg.services;
import employee_reg.dto.Employee;
import java.util.Arrays;

public class EmployeeServices{

private static Employee[] employees=new Employee[0];

public static void addEmployee(Employee employee){
employees=Arrays.copyOf(employees,employees.length+1);
employees[employees.length-1]=employee;
}

public static  Employee[] getEmployee(){
	return employees;
}
}
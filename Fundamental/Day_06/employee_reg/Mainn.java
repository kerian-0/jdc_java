package employee_reg;
import employee_reg.controller.EmployeeController;
import java.io.IOException;



class Mainn{
	public static void main(String[] args)  throws IOException{
		
		EmployeeController ep=new EmployeeController();
		ep.createEmployee();
		ep.showEmployee();
	}
}
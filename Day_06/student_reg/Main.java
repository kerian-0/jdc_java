package student_reg;
import student_reg.controller.StudentController;
import java.io.IOException;


public class Main{
	public static void main(String[] args)  throws IOException {
		StudentController con=new StudentController();
		con.createStudent();
		con.showStudent();
	}
}
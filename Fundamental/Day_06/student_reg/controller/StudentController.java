
package student_reg.controller;
import static student_reg.services.StudentService.*;
// import static student_reg.services.StudentService.addStudent;

import student_reg.dto.Student;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentController{
	private BufferedReader br;
	public StudentController(){
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	
    
      public void createStudent() throws IOException{
      	String yes="";
       
       do{
       	System.out.println("Student Name : ");
       	String name=br.readLine();
       	System.out.println("Student age ?");
       	int age=Integer.parseInt(br.readLine());
       	System.out.println("Student roll number ? ");
       	int roll =Integer.parseInt(br.readLine());
        

        Student stu=new Student(name,age,roll);
        addStudent(stu);
        System.out.println(" Do you want to add again ?/y");
        yes=br.readLine();
       }while("y".equals(yes));
       
      }


      public void showStudent(){
		for(Student stu: getStudents()){

			System.out.println("My Name is " +stu.getName() +" My age is "+stu.getAge() + " My roll is " + stu.getRoll());
		}



		
		}
	}


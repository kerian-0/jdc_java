public class Main{
	public static void main(String[] args) {
		Student stu=new Student("Andrew",-1);
		System.out.println(stu.getAge());
		System.out.println(stu.getName());
		// stu.setName("Andrew");


		stu.changeNickName("James");

		System.out.println("New Name: "+stu.getName());

		// Student.Checker checker=stu.new Checker();
		// int age=checker.checkAge();
		// System.out.println(age);
        
         Student.Nick nick=new Student.Nick();
         nick.AddNickName("Ko Wa Toke");
		System.out.println("New Name: "+stu.getName());
		doSomething();



	}

	static void doSomething(){

		//local class
		class Work{
			void doWork(){
				System.out.println("Do Work: ! ");
			}
		}

		Work work=new Work();
		work.doWork();
	}
}

class Student{

	private static String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}

	void changeNickName(String nick){
		Nick n=new Nick();
		n.AddNickName(nick);
	}



	String getName(){
			return name;
		}

		int getAge(){
			Checker inner=new Checker();
			return inner.checkAge();
		}

//static nested class
		//name(from ) must be static
		static class Nick{

			void AddNickName(String nickName){
				name=nickName;
				// System.out.println(name);
			}
		}
//it is only used for Student;
// innerclass
	 class Checker{
     
      int checkAge(){
           return age<0?1:age;  //pattern matching
      }
    
	}
}
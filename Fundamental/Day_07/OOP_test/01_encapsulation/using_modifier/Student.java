// public class Student{
// 	private String name;
// 	private int age;
// //setter
// 	public void setName(String name){
// 		this.name=name;
// 	}
// //changing Animal | mutator

// 	public void setAge(int age){
// 		this.age=checkAge(age);
// 	}

//     private int checkAge(int age){
// 	    if(age>0){
// 			this.age=age;
// 		    }
// 		else{
// 			this.age=1;
		
//            }
// 	//getter//|accessors



// 	 public String getName(){
// 		return name;
// 	}
// 	 public int getAge(){
		
// 		return age;
// 	}
// }

 class Student{
	private String name;
	private int age ;

	//setter methods or mutators
	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = checkAge(age);
	}
	
	//encapsulate method
	private int checkAge(int age){
		if(age > 0){
			return age; 
		}
		return 1 ;
	}

	// getter methods or accessors
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}
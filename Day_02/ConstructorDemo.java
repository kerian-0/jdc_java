class ConstructorDemo{

	ConstructorDemo(){
		System.out.println("Hello Constructor");
	}
	public static void main(String args[]){
		//new ConstructorDemo();
		//ConstructorTest test = new ConstructorTest("Mg Mg");
		//System.out.println(test.getName());
		//test.setName("Aung Aung");
		//System.out.println(test.getName());

		ConstructorTest.show();
	}
}

class ConstructorTest{
	String name;

	// Constructor For no argument 
	//ConstructorTest(){
		//super();
	//}




	// Constructor for using argument
	ConstructorTest(String name){
		this.name = name;
		System.out.println("Hello Constructor from constuctor Test");
	}

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return name;
	}

	static void show(){
		System.out.println("Show Something");
	}
}


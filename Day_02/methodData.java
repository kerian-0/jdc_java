class methodData{
	
	// No return No argument
	void doSomething(){
		System.out.println("Do something");
	}

	// No return but require argument
	void doSomethingWithArg(String str){
		System.out.println("Do something with arg : "+ str);
	}

	//with return but no argument
	String getMessage(){
		return "This is return value";
	}

	// With both return and argument 
	int getValue(int a){
		return a;
	}
}

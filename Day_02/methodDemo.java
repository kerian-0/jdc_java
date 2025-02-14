class methodDemo{
	public static void main(String args[]){	
		System.out.println("Method Test");
		//useMethodData();
		//useExerciseOne();
		useScannerData();
		//useExerciseTwo();
	}
	 
	static void useMethodData(){
		methodData data = new methodData();
		data.doSomething();


		data.doSomethingWithArg("Arg1");
		String s = "Arg1";
		data.doSomethingWithArg(s);


		String str = data.getMessage();
		System.out.println(str);


		int val = data.getValue(50);
		System.out.println(val + 10);
		System.out.println("Value: " + val + 10);

	}

	static void useScannerData(){
		//ScannerData d= new ScannerData();
		ScannerData.getData();
		ScannerData.showData();
	}


	static void useExerciseOne(){
		ExerciseOne one = new ExerciseOne();
		one.setData(45);
		int c = one.getData();
		System.out.println("Int Value 2 : " + c);
		System.out.println(one.a);
	}

	static void useExerciseTwo(){
		 ExerciseTwo data = new ExerciseTwo();
		 data.setData();
		 data.showData();
	}

}

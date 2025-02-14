class ExerciseOne{

	int a;

	void setData(int a){
		// a = a 	 		getData value will still get 0 due to global
		// this VarName 	is used for preventing variable hiding 

		this.a = a;
		System.out.println("int value 1 : " + a);
	}

	int getData(){
		return a;
	}

}

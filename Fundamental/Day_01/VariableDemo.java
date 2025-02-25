class VariableDemo{
	//Global Varibale
	String message = "global";

	static String staticMessage = "3";
	 	
	public static void main(String args []) {
		String message ="Hello";
		System.out.println("Local Variable" + message);
		//System.out.println(args[0]);
		
		VariableDemo demo = new VariableDemo();

		System.out.println(demo.message);
		System.out.println(staticMessage);
		
		ObjectData data = new ObjectData();

		System.out.println("Obj 1 before "+data.instance_data);
		System.out.println("Obj 1 before "+data.static_data);

		data.instance_data = 30;
		ObjectData.static_data = 50;

		System.out.println("Obj 1 after "+data.instance_data);
		System.out.println("Obj 1 after "+data.static_data);


		ObjectData data2 = new ObjectData();
		// instance variable can copy so data2 is not related to data1 so the value is 0.
		// instance variable = object variable
		System.out.println("Obj 2 before "+data2.instance_data);
		
		// static variable cannot copy so data2 is the same as data1 so the value is 50
		// static variable = class variable
		System.out.println("Obj 2 before "+data2.static_data);
  	}
}
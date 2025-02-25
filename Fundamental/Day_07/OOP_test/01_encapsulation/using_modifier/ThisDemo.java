 class ThisDemo{
	 String name;
   ThisDemo(String name,int age){
   	this(name);
		System.out.println("Using with 2 arg constructor "+name + " "+age);

   }

	
	ThisDemo(String name){
		// this(name);
		System.out.println("Using with single arg constructor "+name);
	}
	// ThisDemo(){
	// 	System.out.println("Using  withoutConstructor !");
	// }
	public static void main(String[] args) {
		ThisDemo demo=new ThisDemo("Hello",3);
		
	}
}

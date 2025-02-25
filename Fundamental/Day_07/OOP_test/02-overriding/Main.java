class Main{
	public static void main(String[] args) {
		Lion lion=new Lion();
		lion.sleep();
		lion.live();
		int a=10;
		byte b=20;a=b; //(implicit)
		b=(byte) a;//(explicit)
		A aa=new B();
	    // B bb=new A();
}}

class Parent{}
class Child extends Parent{}

class Animal{

	void sleep(){
		System.out.println("Sleep on ground !");
	}

	 void live(){
		System.out.println("Lived in forest !");
	}
	public Parent getParent(){
		return new Child();
	}

}

class Lion extends Animal{

    @Override
	public Child getParent(){
      return new Child(); 
	}

   @Override
   void live(){
		System.out.println("Lived in cage !");
	}


}


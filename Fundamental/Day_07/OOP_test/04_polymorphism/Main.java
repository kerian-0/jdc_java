public class Main{
	public static void main(String[] args) {

		//many behavior

		A a=new A();
		a.doSomething();
		A aa=new B();
		aa.doSomething();

		B b=(B)new A();

		// aa.show();
		A aaa=new C();
		aaa.doSomething();
		// aaa.show();
		//many shapes

		A s1=new C();
		s1.doSomething();

		B s2=new C();
		s2.doSomething();
		s2.show();
		C s3=new C();
		s3.doSomething();
		s3.show();
		Object s4=new C();
		// s4.doSomething();
		// s4.show();
	}
}

class A{
	void doSomething(){
			System.out.println("Do somethig from A");}
	}


class B extends A{

	@Override
	void doSomething(){
		System.out.println("Do something from B");
	}

	void show(){
		System.out.println("Show something from B ");

	}

}
class C extends B{

}
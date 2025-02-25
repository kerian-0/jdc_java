public class ClassUsage{
	public static void main(String[] args) {
	// TestClass test=new TestClass();
		TestClass.show();

	}
	
}

class TestClass{
    static {
      System.out.println("static Block !");
	}

	{
      System.out.println("instance  Block !");

	}

	TestClass(){
		System.out.println("Constructor !");
	}

	static void show(){
		System.out.println("show static");
	}
	void useLocal(){
		class LocalInnerClass{
			void doSomething(){
				System.out.println("Do Something fro local innerclass:");
			}
		}
	}

	class InnerClass{
            void doSomething(){
				System.out.println("Do Something fro  innerclass:");
			}
	}

	
}
// import pkgKeyword.*;


// class Main extends AboutProtected{
// 	public static void main(String[] args) {
// 		Student stu=new Student();
// 		// AboutFinal aboutfinal=new AboutFinal("Hello");
// 		AboutSuper aboutSuper=new AboutSuper();
// 		// AboutProtected abPro=new AboutProtected();

// 		stu.study();
// 		stu.eat();
// 		stu.sleep();
// 		// stu.
// 		// System.out.println(aboutfinal.name);
// 		// System.out.println(aboutSuper.doSomething());
// 		aboutSuper.doSomething();
		
// 		stu.partTimeWork();
// 	}

// 	void doWithProtected(){
// 		doWithDefault();
// 		doWithDefault();
// 	}
// }

import pkgKeyword.*;

class Main extends AboutProtected{
	public static void main(String[] args) {
		Student student = new Student();

		//about final keyword
		// AboutFinal fi = new AboutFinal("Hello");

		//About super keyword
		AboutSuper su = new AboutSuper();
		su.doSomething();

		//from student
		student.study();
		
		//from Human
		student.eat();
		student.sleep();

		//from PartTimeWorker
		student.partTimeWork();
	}

	void useFromProtected(){
		doWithDefault();
		doWithProtected();
	}
}
package pkgKeyword;
public final class AboutFinal{
	//must be initialized with using constructor or direct  assign value
	  String name;

	public AboutFinal(String name){
		this.name=name;
	}
	//final class not extends from other class ,btw get from final clas to other

	public  void show(){
		System.out.println("Use final");
	}
}
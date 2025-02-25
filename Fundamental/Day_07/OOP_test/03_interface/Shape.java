interface Shape{
//default modifier always 
	//different between interface and abstract is interface is not hava method body btw,abstract has body method7
	//default public static final
 String name="something";
  void draw();


  //after java 8

  static void show(){
  	// name="other";
  System.out.println("show");
 }

 default void check(){
 	System.out.println("Use default");
 }

}
class Ternary{
	static public void main(String args[]){
		System.out.println(6 % 2 == 0 ? "even" : "odd");
		System.out.println(5 % 2 == 0 ? "even" : "odd");
		System.out.println(7 % 2 ==0 ? 0 : 1);
		int val = 4;

		System.out.println(val < 10 ?  smaller() : bigger()) ;
	  } 

	static String smaller(){
		return "Smaller";
	}
	static String bigger(){
		return "Bigger";
	}
  
}
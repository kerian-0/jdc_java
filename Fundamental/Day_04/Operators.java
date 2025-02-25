class Operators{
	public static void main(String args[]){
	// =+ and += is not the same

	// Execute from left to right
	 System.out.println("Result " + 4 + 5 );
	 System.out.println("Result " + (4 + 5));
	 System.out.println(4 + 5 + " Result");

	/* 
	Operator Order 
	 (* / %) 	First
	 (+ -)		Second
	*/
	System.out.println( 8 / 2 % 3 * 3 - 2 + 4);
	System.out.println(4 + 2 * 8);


	// a++    evaluate a then add 1 
	// ++a 	  add 1 then evaluate a
	int a = 7;
	System.out.println("This is 1st a testing : " + (a++ + a++));		// First a is 7 then add one , second a is 8 then add one
	System.out.println("This is 2nd a testing : "+ a);					// So a is 9

	int b = 7;
	System.out.println("This is 1st b testing : " + (++b + ++b));		// First add one and first b is 8 , add one and second b is 9
	System.out.println("This is 2nd b testing : "+ b);					// b is 9

	int c = 7;
	System.out.println("This is 1st c testing : "+ (c++ + ++c)); 		// First c is 7 then add one, add one again then second c is 9
	System.out.println("This is 2nd c testing : " + c);					// c is 9

	int d = 7;
	System.out.println("This is 1st d testing : " + (++d + d++)); 		// First add one then first d is 8, second d is also 8 then add one
	System.out.println("This is 2nd d testing : " + d);					// d is 9
	}
}

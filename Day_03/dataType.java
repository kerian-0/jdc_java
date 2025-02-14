class dataType{

	public static void main(String [] args){
 /* byte  		-128 <==> 0 <==> 127
    short  		-2*7 <==> 0 <==> 2*7 -1
 			   -32768 <==> 0 <==> 32767
     int 		2 billion <==> 0 <==> 2 billion */
     	
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = -30;
		long longValue = 40;
		


//	 	Number variables can be assigned small value type to big variable
		System.out.println("ShortValue Before: "+shortValue);
		shortValue = byteValue;				 	// up cast or implicit cast 
		System.out.println("ShortValue After :"+ shortValue);



// 	Number variables can't be assigned big value type to small variable
//		bvalue = svalue;   ! error

		byteValue = (byte )shortValue;		 // down cast or explicit cast
		System.out.println(byteValue);
		System.out.println(shortValue);



// 	Lossy converstion
		byte  byte01 = 50;
		short short01 = 130;
		System.out.println("This is before assigning short value into byte variable");
		System.out.println(byte01 + " " + short01);
		byte01 = (byte)short01; 
		System.out.println("This is after assigning short value into byte variable");
		System.out.println(byte01 + " "+ short01);



/*    Suffix use type = float (f,F) / double (d,D) / long (l,L)
		Suffix is used for overriding default value of number such as int and float */
		float floatValue = 20.12f;
		double doubleValue = -23.99d;



//	   unicode characters [Can be found in Unicode Character Tables]
		char c1 = '\u0021';	
		char c2 = '!';
		char c3 = 65; 							// Ascii Table Keyword

		System.out.println(c1 +" "+ c2);
		System.out.println(c3);


	}

}
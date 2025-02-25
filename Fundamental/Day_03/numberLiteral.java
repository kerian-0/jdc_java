class numberLiteral{
	public static void main(String args[]){
		// 	Number literals 
		int binaryNumber = 0b01;  			// Binary [0,1]			0b
		System.out.println(binaryNumber);

		int octalNumber1 = 07;				// Octal [0-7]			0
		int octalNumber2 = 010;
		System.out.println(octalNumber1);
		System.out.println(octalNumber2);

		int hexaNumber1 = 0xA;				// Hexa [0-9,a-f]	0x
		System.out.println(hexaNumber1);
		
		int bignumber = 1_000_000;
		System.out.println(bignumber);

		float fv = 23.92f;
		double dv = 100.23d;
		dv = fv;
		System.out.println(fv + " "+dv);
	}
}

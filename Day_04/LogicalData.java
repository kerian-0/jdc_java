class LogicalData{
	static boolean getTrue() {
			System.out.println("getTrue is invoked");
			return true;
		}
	static boolean getFalse() {	
			System.out.println("getFalse is invoked");	
			return false;
		}

	static void ConditionalAnd(){
		System.out.println("Conditional And opeartor");
		System.out.println("TT is " + (getTrue() && getTrue()));
		System.out.println("TF is " + (getTrue() && getFalse()));
		System.out.println("FT is " + (getFalse() && getTrue()));
		System.out.println("FF is " + (getFalse() && getFalse()));
		System.out.println("");
	}

	static void ConditionalOr(){
		System.out.println("Conditional Or opeartor");
		System.out.println("TT is %b".formatted(getTrue() || getTrue()));
		System.out.println("TF is %b".formatted(getTrue() || getFalse()));
		System.out.println("FT is %b".formatted(getFalse() || getTrue()));
		System.out.println("FF is %b".formatted(getFalse() || getFalse()));
		System.out.println("");
	}

	static void LogicalAnd(){
		System.out.println("Logical And operator");
		System.out.println("TT is %b".formatted(getTrue() & getTrue()));
		System.out.println("TF is %b".formatted(getTrue() & getFalse()));
		System.out.println("FT is %b".formatted(getFalse() & getTrue()));
		System.out.println("FF is %b".formatted(getFalse() & getFalse()));
		System.out.println("");
	}

	static void LogicalOr(){
		System.out.println("Logical Or operator");
		System.out.println("TT is " + (getTrue() | getTrue()));
		System.out.println("TF is " + (getTrue() | getFalse()));
		System.out.println("FT is " + (getFalse() | getTrue()));
		System.out.println("FF is " + (getFalse() | getFalse()));
	}

	static void ExclusiveOr(){
		System.out.println("Exclusive Or operator");
		System.out.println("True ^ True is %b".formatted(getTrue() ^ getTrue()));
		System.out.println("True ^ False is %b".formatted(getTrue() ^ getFalse()));
		System.out.println("False ^ True is %b".formatted(getFalse() ^ getTrue()));
		System.out.println("False ^ False is %b".formatted(getFalse() ^ getFalse()));
	}
}

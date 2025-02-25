import java.util.Scanner;
class CheckMark{
	static Scanner sc = new Scanner(System.in);
	static int myan,eng,maths,chem,phy,bio;
	public static void main(String args[]){
		System.out.println("Enter myan : ");
		myan = sc.nextInt();

		System.out.println("Enter eng : ");
		eng = sc.nextInt();

		System.out.println("Enter math : ");
		maths = sc.nextInt();

		System.out.println("Enter chem : ");
		chem = sc.nextInt();

		System.out.println("Enter phy : ");
		phy = sc.nextInt();

		System.out.println("Enter bio : ");
		bio = sc.nextInt();
		checkTest();
	}
	static void checkTest(){
		boolean fail = isFail(myan,eng,maths,chem,phy,bio);
		if (fail){
			System.out.println("You failed");
		}else if(normalPass()){
			System.out.println("You passed");
		}else{
			int distionction = 0;
			if(myan >= 75){
				distionction++;
			}
			if(eng >= 75){
				distionction++;
			}
			if(maths >= 80){
				distionction++;
			}
			if(chem >= 80){
				distionction++;
			}
			if(phy >= 80){
				distionction++;
			}
			if(bio >= 75){
				distionction++;
			}
			System.out.println("You passed with distionction");
		}
	}


	// Fail
	static boolean  isFail(int myan,int eng,int maths,int chem,int phy,int bio){
		return (myan < 40 || eng < 40 || maths < 40 || chem < 40 || phy < 40 || bio < 40);
	}

	static boolean  normalPass(){
		return (myan < 75 && eng < 75 && maths < 80 && chem < 80 && phy < 80 && bio < 75);
	}



	/* checkmark fail, normal , pass, distiction
	 total mark 
	 average mark 
	 grade based on average mark 
	mark > 50 = grade C
	mark > 70 = grade B
	mark > 90 = grade A
	*/

}



import java.util.Scanner;
// Usage of scannerdata to Type in the command prompt and evaluate the result
class ScannerData{

	static int value01; 
	static int value02;
	static void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Type int value ");
		value01 = sc.nextInt();
		value02 = sc.nextInt();
	}

	static void showData(){
		System.out.println( value01 + value02);
	}
}

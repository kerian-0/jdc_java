import java.util.Scanner;
// Usage of scannerdata to Type in the command prompt and evaluate the result

class ExerciseTwo{
	// create global variable name of item(String) and price(Int)
	 String item;
	 int price;

	//create method of setData and it might hv scanner object to get those data item
	  void setData(){
		Scanner sc = new Scanner(System.in);

	//print is only printing Type and println will type and skip to next line.
		System.out.print("Type ");  
		item = sc.nextLine(); 			// To be able to type string in commend prompt
		System.out.print("Price ");
		price = sc.nextInt();			// To be able to type number in commend prompt
	}

	//to get the value of item and price
	void showData(){
		System.out.println("The value of this " + item + " is " + price +" kyats");
	}

}

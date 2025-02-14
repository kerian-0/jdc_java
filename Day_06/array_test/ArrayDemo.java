import java.util.Scanner;
import java.util.Arrays;
class ArrayDemo{

	private static Scanner sc;
	private static String[] names;
	private static int qty;

	public static void main(String[] args) {

		sc=new Scanner(System.in);
		greet("Welcome to Program");
		createArray();

		addStudentName();

		showNames();
		greet("Bye Bye");
	}
	static void greet(String message){
		System.out.println("\n===================");
		System.out.println("==============================");
		System.out.println("=============================="+message+"=========");
		System.out.println("==============================\n");


	}
	static void createArray(){
		System.out.print("How many Student do you want to save? : ");
		qty=sc.nextInt();
		names=new String[qty];
	}

     static void addToArray(String name){
     	String[] temp=new String[names.length+1];
     	for(int i=0;i<names.length;i++){
     		temp[i]=names[i];
     	}
     	temp[names.length]=name;
     	names=temp;
     }
    static void arrayCopyOf(String anme){
    	names=Arrays.copyOf(names,names.length+1);
    	names[names.length-1]=name;
    }
	static void addStudentName(){	
		String confirm="";
		int index=0;
		
		do{
			if(index<qty)
				System.out.print("Type Student name : ");
			String name=sc.next();
			names[index]=name;
			
			System.out.print("Do you want to type again(y/) :");
			confirm=sc.next().toLowerCase();
			index++;

		}while("y".equals(confirm));
	}

	static void showNames(){
		System.out.println("Student Names: \t");
		for(int x=0;x<names.length;x++){
			System.out.print(names[x] + " ");
		}
	}
}
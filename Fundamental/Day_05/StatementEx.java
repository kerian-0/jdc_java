import java.util.Scanner;

class StatementEx{
	public static void main(String[] args) {
		boolean flag=true;
		while(flag){
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome My Programm: ");
			System.out.println("1:Prime Number ");
			System.out.println("2:Fibonancci ");
			System.out.println("3:Enter Number to get the day: ");
			System.out.println("Exit the program: ");


			int menu=sc.nextInt();
			switch(menu){
			case 1:{
				System.out.println("Enter a num: ");
				int num=sc.nextInt();
				int count=0; 

				for(int i=1;i<=num;i++){
					if(num%i==0){
						count++;
					}
				}
				if(count==2){
			System.out.println(num+" is Prime Number: ");

				}else{
			System.out.println(num+" is not Prime: ");

				}
			};
			break;
		case 2:{
			int num=sc.nextInt();
			
			int first=0;
			int second=1;
			int next;
			int count=0;
			System.out.println("Enter a num: ");
			do{
				next=first+second;
				first=second;
				second=next;
				count++;
		       }while(count<num-2);
			}
			break;

			case 3 : {
				System.out.print("Enter a num : ");
				int num = sc.nextInt();

				switch(num) {
				case 1 : 
					System.out.println("Monday");
					break;
				case 2 : 
					System.out.println("Tuesday");
					break;
				case 3 : 
					System.out.println("Wednesday");
					break;
				case 4 : 
					System.out.println("Thursday");
					break;
				case 5 : 
					System.out.println("Friday");
					break;
				case 6 : 
					System.out.println("Saturday");
					break;
				case 7 : 
					System.out.println("Sunday");
					break;
				default : 
					System.out.println("Invalid Number!!!");
				}
			}
			break;

			case 4 : {
				System.out.println("Exit Program");
				flag = false;
			}
			break;

			default : 
				System.out.println("Thanks you"); 
				break;


			}



		}
	}
}
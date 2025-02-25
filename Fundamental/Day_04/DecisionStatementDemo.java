import java.util.Scanner;
class DecisionStatementDemo{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		oneWay();
		//defaultWay();
		// multipleWay();
	}
		
		static void oneWay(){
			System.out.println("Enter a number");
			int num = sc.nextInt();

			if(num % 2 == 0) {					// One Way (work only when true)
				System.out.println("Even");
			}

			if (num > 0){						// One Way
				System.out.println("Positive Number");
			}
			System.out.println("Terminated");
		}
		

		static void defaultWay(){				// Default Way (if statement is false,else will work as default )
			System.out.println("Enter a string : ");
			String st = sc.next();

			if(st.equals("Sunny")) {					
				System.out.println("Weather is fine");
			}else{								
				System.out.println("Weather is not fine");
			}
			System.out.println("Terminated");
		}

		static void multipleWay(){				// Multiple Way (Statement works line by line)
			System.out.println("Enter a mark : ");
			int mark = sc.nextInt();
			if(mark < 0){
				System.out.println("Invalid Mark");
			}else if(mark < 20){
				System.out.println("Grade E");
			}else if(mark <40){
				System.out.println("Grade D");
			}else if (mark < 60){
				System.out.println("Grade C");
			}else if (mark < 80){
				System.out.println("Grade B");
			}else if(mark <= 100){
				System.out.println("Grade A");
			}else{
				System.out.println("Invalid Mark");
			}
		}

}

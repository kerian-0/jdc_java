// import java.util.Scanner;
public class MyanmarConverter{

	// public static void main(String[] args) {
	// 	Scanner sc=new Scanner(System.in);

    //   System.out.println("Enter a year: ");
    // int  year=sc.nextInt();
    //    System.out.println("Enter a month: ");
    // int  month=sc.nextInt();
    //    System.out.println("Enter a day: ");
    // int  day=sc.nextInt();

     
	convert(year,month,day);	
	}
	public static int convert(int year,int month,int day){
	// 		year=month<=4 && day <=16 ?(year=year-639):(year=year-638);
	// 		System.out.println(year);
     // return year ;
     
		if(month==1 && month<4){
			return year -639;
		}
		if(month==4){
			if(day==1 && day<=16){
				return year -639
			}
		}
		return year -638;

	}
}

//Eng to Myan =>year -638 normal && year - 639(if month  between 1 to 4 and day 16 639) 


import java.io.*;
import maharbote_program.Maharbote;
import maharbote_program.User;
class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {

		Maharbote bote=new Maharbote();
		MyanmarConverter converter=new MyanmarConverter();
		greet("Welcome to maharbote program");
		User user=getUser();
		int mmYear=converter.convert(user.getYear(),user.getMonth(),user.getDay());
		//show result

		// int []array=bote.getMaharBote(mmYear);
		showMaharBote(bote.getMaharBote(mmYear));
		showSign(user.getName(),bote.getSign(mmYear,user.getDayName()));
		//greeting
		greet("Bye Bye");

	}

	static void showSign(String sign){
		System.out.println("%s of sign is: %s".formatted(name,sign));
	}

   static void showMaharBote(int[] boteArray){
   	System.out.println("""
   		     |  %d |
   		-----|-----|-----
   		  %d | %d  | %d  
   		-----|-----|-----
   		  %d | %d  | %d


   		""".formatted(bote[0],bote[1],bote[2],bote[3],bote[4],bote[5],bote[6]));

   }

	static void getUser() throws IOException{
		System.out.print("Type User name: ");
		String name=br.readLine();
		System.out.print("Type Year: ");
		int year =Integer.parseInt(br.readLine());
		System.out.print("Type Month: ");
		int month =Integer.parseInt(br.readLine());
		System.out.print("Type Day: ");
		int day=Integer.parseInt(br.readLine());
		System.out.print("Type Day name: ");

		System.out.println("""
			Type day number: 
			1.Sunday
			2.Monday
			3.Tuesday
			4.Wednesday
			5.Thursday
			6.Friday
			7.Saturday

			""");

		int dayName=Integer.parseInt(br.readLine());
		User user=new User(name,year,month,day,dayName);
		return user;
	}

	static void greet(String message){
		System.out.println(" =====================");
		System.out.println("========="+message+"======================");
	    System.out.println(" =====================");

	}
}
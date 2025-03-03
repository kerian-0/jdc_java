package com.jdc.ly.enum_test;

import java.util.Scanner;

public class WorkerDemo {
	private static Scanner sc;

	enum Day{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		
		int day=selectDay();
		
		String result=checkWorkDay(day);
		System.out.println(result);
		
		

	}
	static String checkWorkDay(int d) {
		Day day=Day.Sunday;
		for(Day dd:Day.values()) {
			if(dd.ordinal() ==(d-1)) {
				day=dd;
				break;
			}
		}
//		return switch(day) {
//		case Monday,Tuesday,Wednesday,Thursday,Friday->"Work day";
//		default->"Off-day";
//		};
		String res=null;
		
		switch(day) {
		case Monday,Tuesday,Wednesday,Thursday,Friday:
			return "Work day";
		case Saturday,Sunday:
			return "Off-day";	
		}
		return res;
		 
	}
	
	static int selectDay() {
		System.out.println("""
			Select Number by Day
			1.Sunday	
			2.Monday 
			3.Tuesday 
			4.Wednesday 
			5.Thursday  
			6.Friday 
			7.Saturday 
				""");
		System.out.println("Enter a number: ");
		return sc.nextInt();
	}

}

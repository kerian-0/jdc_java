package com.jdc.ly;

import com.jdc.ly.converter.Conveter;
import com.jdc.ly.converter.StringConvert;
import com.jdc.ly.converter.IntegerConveter;

public class Main {

	public static void main(String[] args) {
//define T for object generic in Data class Data<T>
		Data<String> d = new Data<String>();
		d.setValue("Hello");
		String s=d.getValue();
		System.out.println(s);
		Data.doSomething("Hello");
		
		Data<Integer> d1= new Data<Integer>();
		d1.setValue(30);
		int s1=d1.getValue();
		System.out.println(s1);
		
		Conveter<String,Integer> cInt=new IntegerConveter();
		int a=cInt.convert("50");
		System.out.println(a);
		
		Conveter<Integer, String> cString=new StringConvert();
		String s2=cString.convert(50);
		System.out.println(s2);
		
		

	}
	
	

}

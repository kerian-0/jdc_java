package com.jdc.ly.check;

import java.io.File;
import java.io.IOException;


public class CheckExceptionData {
	public String createFile(String dir) {
		try {
			File file=new File(dir+"test.txt");
			file.createNewFile();
			String str= file.exists() ? "exit" :"doesn't exit";
			System.out.println(str);
			return str;
			
		}catch(IOException e) {
			System.out.println(e);
			return "IOException";
			
		}
		
	}

}

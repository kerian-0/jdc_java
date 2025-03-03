package com.jdc.ly.check;

import java.io.File;
import java.io.IOException;


public class CheckExceptionData {
	public String createFile() {
		try {
			File file=new File("D:/data/test.txt");
			file.createNewFile();
			return file.exists() ? "exit" :"doesn't exit";
		}catch(IOException e) {
			return "IOException";
		}
		
	}

}

package com.jdc.ly.check;

import java.io.File;
import java.io.IOException;


public class CheckExceptionData {
	void createFile() throws IOException {
		File file=new File("text");
		file.createNewFile();
	}

}

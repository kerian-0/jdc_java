package com.jdc.ly.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.ly.check.CheckExceptionData;

public class CheckExceptionTest {
	CheckExceptionData data = new CheckExceptionData();

	@Test
	void fileTest() {
		String res = data.createFile("");
		assertEquals(res, "IOException");
		
		 res = data.createFile("D:/data/");
		assertEquals(res, "exit");
	}

}

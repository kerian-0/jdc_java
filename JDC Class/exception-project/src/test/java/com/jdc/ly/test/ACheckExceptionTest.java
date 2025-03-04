package com.jdc.ly.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.ly.check.CheckExceptionData;

public class ACheckExceptionTest {
	CheckExceptionData data = new CheckExceptionData();

	@Test
	void fileTest() {
		String res = data.createFile("");
		assertEquals(res, "exit");
		
		 res = data.createFile("D:/data/");
		assertEquals(res, "Io excepiton");
	}

}

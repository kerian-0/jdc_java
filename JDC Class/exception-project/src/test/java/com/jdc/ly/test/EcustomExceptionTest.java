package com.jdc.ly.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.ly.custom.CustomExceptionData;
import com.jdc.ly.custom.MyCheckException;
import com.jdc.ly.custom.MyUncheckException;

public class EcustomExceptionTest {

	static CustomExceptionData data;

	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
	}

	@Test
	void test() {
		assertThrows(MyUncheckException.class,()->data.getMyUnCheckException(""));
//		assertThrows(MyUncheckException.class,()->data.change(" "));
		assertThrows(MyCheckException.class,()->data.getMyCheckException(""));
	}
}

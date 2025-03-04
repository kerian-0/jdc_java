package com.jdc.ly.test;

import org.junit.jupiter.api.Test;

import com.jdc.ly.handler.Handler;

public class BHandlerTest {
	Handler handle = new Handler();

	@Test
	void testName() {

		handle.useName();

	}

	// test recursive
	@Test
	void testAge() {
		handle.useAge();

	}

	@Test
	void testRecursive() {
		handle.recursive();
	}

}

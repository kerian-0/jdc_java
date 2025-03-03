package com.jdc.ly.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jdc.ly.trycatch.TryCatchData;

public class TryCatchTest {
	TryCatchData data = new TryCatchData();

	@Test
	public void testTryWithFinally() {
		String res = data.useCheckedWithTryFinallyResource();
		System.out.println(res );
	}

	@Test
	public void testTryMultiCatch() {
		int result = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(-1, result);
		int result1 = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(-1, result1);
	}

	@Test
	public void testTryCatch() {
		String res1 = data.useUncheckedWthTryCatch(3300);
		System.out.println(res1);
	}
}

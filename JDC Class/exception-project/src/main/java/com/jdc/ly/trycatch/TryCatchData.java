package com.jdc.ly.trycatch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchData {

	public String useCheckedWithTryFinally() {
		String str = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			return br.readLine();
		} catch (Exception e) {
			str = "IOException";
		} finally {
			str = str + "with finally";
		}
		return str;
	}

	public int useUncheckedWithTryMultiCatch(int[] array, String index) {
		try {
			int i = Integer.parseInt(index);
			return array[1];
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			return -1;
		}

	}

	public String useUncheckedWthTryCatch(Integer num) {
		try {
			int i = num / 0;
			Object b = (Object) num;
			return (String) b;

		} catch (ClassCastException e) {
			System.out.println(e);
			return "ClassCastException";
		} catch (ArithmeticException e) {
			return "ArithmeticException";
		} catch (RuntimeException e) {
			return "ArithmeticException";
		}

	}
}

package com.jdc.ly.trycatch;

public class TryCatchData {
	public int useUncheckedWithTryMultiCatch(int[] array, String index) {
		try {
			int i= Integer.parseInt(index);
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

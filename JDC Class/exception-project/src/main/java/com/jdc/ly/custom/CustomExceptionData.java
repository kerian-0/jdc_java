package com.jdc.ly.custom;

public class CustomExceptionData {

//	public void useException(String message) {
//		changeCheckToUnCheck(message);
//	}
	public String changeCheckToUnCheck(String message) {
		try {
			String mess = getMyCheckException(message);
			System.out.println(mess);

		} catch (MyCheckException e) {
			System.err.println(e.getMessage());
			throw new MyUncheckException(e.getMessage());
		}
		return message;
	}

	public String getMyCheckException(String message) throws MyCheckException {
		if (message.isBlank() || message != null) {
			throw new MyCheckException("There is no message yet for check");
		}
		return message;

	}

	public String getMyUnCheckException(String message) {
		if (message.isBlank()) {
			throw new MyUncheckException("There is no message yet for check");
		}
		return message;
	}
}

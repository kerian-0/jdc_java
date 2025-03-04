package com.jdc.ly.custom;

@SuppressWarnings("serial")
public class MyUncheckException extends RuntimeException{
	
	public MyUncheckException() {
		super();
	}
	
	public MyUncheckException(String message) {
		super(message);
	}

}

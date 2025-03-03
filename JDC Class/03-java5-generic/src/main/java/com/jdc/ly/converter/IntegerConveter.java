package com.jdc.ly.converter;

public class IntegerConveter implements Conveter<String,Integer> {

	@Override
	public Integer convert(String s) {
		
		return Integer.valueOf(s);
	}

}

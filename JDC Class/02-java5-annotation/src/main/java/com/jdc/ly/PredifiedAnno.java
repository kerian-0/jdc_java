package com.jdc.ly;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class PredifiedAnno implements Serializable {

	 private int count;
	 
	 @Deprecated
	 int counter() {
		 return count++;
	 }
	 @SafeVarargs
	static void add(List<Object>...strs) {
		 for(List<Object> list:strs) {
			 System.out.println(list);
		 }
	 }
	 
}

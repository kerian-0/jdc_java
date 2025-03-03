package com.jdc.ly.record;

public record StudentRecord (
		int id,
		String name,
		int age
		) {
	
	
	//Canonical Constructor
//	public StudentRecord(int id,String name,int age) {
//		this.id=id;
//		this.name=name;
//		this.age=age;
//	}
	
////	public StudentRecord{
//		if(id<0) {
//			throw  new IllegalArgumentException();
//		}
//		if(null==name) {
//			throw new NullPointerException();
//		}
//		if(age<=0) {
//			throw new IllegalArgumentException();
//		}
//	}
	
	public StudentRecord(String name) {
		this(1, name, 20);
	}
	

}

package com.jdc.ly.wildcard;

public class WildCardDemo {
	static Data<?> data;

	public static void main(String[] args) {

		Data<Object> d3 = new Data<>();
		d3.setData(new Object());

		useData(new Data<Object>());
		useData(new Data<String>());
		
		@SuppressWarnings("unused")
		Data<?> d5 = new Data<Integer>();
//		d5.setData(10);
	}

	static void useData(Data<?> data) {
		// data.setData(data);not be setter
		System.out.println(data.getData());
	}
}

//class ChildData<T> extends Data<T> {
//
//	public ChildData(T data) {
//		super(data);
//		// TODO Auto-generated constructor stub
//	}
//
//}

class Data<T> {
	private T data;

	public Data() {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

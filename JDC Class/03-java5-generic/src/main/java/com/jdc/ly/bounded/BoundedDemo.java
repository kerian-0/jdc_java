package com.jdc.ly.bounded;

import com.jdc.ly.utils.A;
import com.jdc.ly.utils.B;

public class BoundedDemo {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Data<A> a=new Data<>(new A());
		Data<B> s=new Data<>(new B());

	}

}


class Data<T extends A> {
	private T data;

	public T getData() {
		return data;
	}

	public Data(T data) {
		super();
		this.data = data;
	}

}
package com.jdc.ly.boundedwithwildcard;

import com.jdc.ly.utils.A;
import com.jdc.ly.utils.B;
import com.jdc.ly.utils.C;

public class BoundedWithWildCardDemo {

	public static void main(String[] args) {
		Data<A> a = new Data<>();
		Data<B> b = new Data<>();
		Data<C> c = new Data<>();
		Data<Object> o = new Data<>();

		upper(b);
		upper(c);
		lower(b);
		lower(a);
		lower(o);

		Data<? super B> b1 = new Data<>();// Object // least
		b1.setData(new B());
		@SuppressWarnings("unused")
		Data<? extends B> b2 = new Data<>();
		// can\t use setter because
//		it can be use for parent type(eg.object)
//		b2.setData(new B());
		b.setData(new B());
		upper(b);
		upper(c);
		lower(b);
		lower(a);
		lower(o);
		System.out.println(b.getData());

	}

	static void upper(Data<? extends B> data) {
//		data.setData(new B());
		// don't accept any setter
		System.out.println("From Upper: " + data.getData());
	}

	static void lower(Data<? super B> data) {
		data.setData(new C());
		System.out.println("From Lower: " + data.getData());
	}
}

class Data<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
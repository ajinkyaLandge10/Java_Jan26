package com.constructor;

class A extends Object {

	public A() {
		super();
		System.out.println(1);
	}
}

public class Ex10 {

	public Ex10() {
		super();
		System.out.println(2);
	}

	public static void main(String[] args) {

		Ex10 obj1 = new Ex10();

	}

}

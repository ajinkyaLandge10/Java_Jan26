package com.Interface;

class A {
	final int MARKS = 10;

	public static final void test() {
		System.out.println("Static Method From Class A");
	}
}

public class Ex2 extends A {

	public static void main(String[] args) {

		Ex2 obj = new Ex2();
		System.out.println(obj.MARKS);
		A.test();

	}

}

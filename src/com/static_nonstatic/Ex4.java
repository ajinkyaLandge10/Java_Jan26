package com.static_nonstatic;

public class Ex4 {
	// multiple copy

	public int b = 20, c = 30;

	public static void main(String[] args) {

		Ex4 obj1 = new Ex4();
		System.out.println(obj1.b); // 20
		System.out.println(obj1.c); // 30

		obj1.b = 200;
		obj1.c = 300;

		System.out.println(obj1.b); // 200
		System.out.println(obj1.c); // 300

		Ex4 obj2 = new Ex4();
		System.out.println(obj2.b); // 20
		System.out.println(obj2.c); // 30

		Ex4 obj3 = new Ex4();
		System.out.println(obj3.b); // 20
		System.out.println(obj3.c); // 30

	}
}

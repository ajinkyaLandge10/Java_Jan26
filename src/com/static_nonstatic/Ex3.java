package com.static_nonstatic;

public class Ex3 {

	// single copy

	public static int b = 20, c = 30;
	// public static int c = 30;

	public static void main(String[] args) {

		Ex3 obj1 = new Ex3();
		System.out.println(obj1.b); // 20
		System.out.println(obj1.c); // 30

		obj1.b = 200;
		obj1.c = 300;

		System.out.println(obj1.b); // 200
		System.out.println(obj1.c); // 300

		Ex3 obj2 = new Ex3();
		System.out.println(obj2.b); // 200
		System.out.println(obj2.c); // 300

	}

}

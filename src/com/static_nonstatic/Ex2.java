package com.static_nonstatic;

public class Ex2 {

	public static int b = 20;

	public static void main(String[] args) {
		Ex2 obj1 = new Ex2();
		obj1.test1();
		obj1.test3();
		System.out.println(obj1.b); // 20

	}

	public static void test1() {
		System.out.println("test1");
	}

	public static void test3() {
		System.out.println("test3");
	}

}

package com.methods;

public class Ex6 {

	public static int a = 10;
	public int c = 20;

	public static void main(String[] args) {

		// test1(), test2(), test3()

		Ex6 obj = new Ex6();
		obj.test1();

		Ex6.test2();
		Ex6.test3();

	}

	public void test1() {
		System.out.println("test1");
	}

	public static void test2() {
		// test1()
		Ex6 obj = new Ex6();
		obj.test1();
	}

	public static void test3() {
		// test1();
		Ex6 obj = new Ex6();
		obj.test1();
	}

}

package com.methods;

public class Ex7 {

	public static int a = 10;
	public int c = 20;
	public static Ex7 obj = new Ex7();

	public static void main(String[] args) {

		// test1(), test2(), test3()

		Ex7.obj.test1();
		Ex7.test2();
		Ex7.test3();

	}

	public void test1() {
		System.out.println("test1");
	}

	public static void test2() {
		// test1()
		Ex7.obj.test1();
	}

	public static void test3() {
		// test1();
		Ex7.obj.test1();
	}

}

package com.methods;

public class Ex8 {

	public static commonMethod obj = new commonMethod();

	public static void main(String[] args) {

		// test1(),test2(),test3()

		Ex8.obj.test1();
		Ex8.obj.test2();
		Ex8.obj.test3();
		
		Ex8.test();

	}

	public static void test() {
		// test1(),test2(),test3()
		Ex8.obj.test1();
		Ex8.obj.test2();
		Ex8.obj.test3();
	}

}

class commonMethod {

	public void test1() {
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}

	public void test3() {
		System.out.println("test3");
	}

}

package com.polymorphism;

class P2 {
	int a = 10;

	public void test1() {
		System.out.println(1);
	}
}

public class Ex9 extends P2 {

	int x = 10;

	public void test2() {
		System.out.println(2);
	}

	public static void main(String[] args) {

		Ex9 obj1 = new Ex9();
		System.out.println(obj1.x);
		obj1.test2();
			
		System.out.println(obj1.a);
		obj1.test1();

	}

}

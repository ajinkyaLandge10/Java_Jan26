package com.polymorphism;

class P {
	int a = 10;

	public void test1() {
		System.out.println(1);
	}
}

public class Ex8 {

	int x = 10;

	public void test2() {
		System.out.println(2);
	}

	public static void main(String[] args) {

		P obj = new P();
		obj.test1();
		System.out.println(obj.a);

		Ex8 obj1 = new Ex8();
		obj1.test2();
		System.out.println(obj1.x);
		

	}

}

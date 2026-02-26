package com.encapsulation;

class A1 {
	private int a = 10, b = 20;

	public int test1() {
		return a;
	}
	public int test2() {
		return b;
	}

}

public class Ex4 {
	public static void main(String[] args) {
		// a, b
		A1 obj = new A1();
		obj.test1(); // 10
		obj.test2(); // 20

		int sum = obj.test1() + obj.test2();
		System.out.println(sum); // 10+20 = 30

	}

}

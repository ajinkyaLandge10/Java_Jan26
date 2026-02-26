package com.constructor;

public class Ex7 {

	int x;

	public Ex7() {
		System.out.println(1);
	}

	public Ex7(int a) {
		this.x = a;
	}

	public static void main(String[] args) {

		Ex7 obj1 = new Ex7();
		System.out.println(obj1.x); // 0

		Ex7 obj2 = new Ex7(10);
		System.out.println(obj2.x); // 10

		Ex7 obj3 = new Ex7(100);
		System.out.println(obj3.x); // 100

	}

}

package com.constructor;

public class Ex8 {

	public Ex8(int a) {
		System.out.println(1);
	}

	public Ex8(float a, char ch) {
		System.out.println(2);
	}

	public Ex8(byte a) {
		System.out.println(3);
	}

	public Ex8(double a) {
		this();
		System.out.println(4);
	}

	public Ex8() {
		System.out.println(5);
	}

	public Ex8(double a, char ch, int x) {
		this();
		System.out.println(6);
	}

	public static void main(String[] args) {

		Ex8 obj = new Ex8();
		Ex8 obj2 = new Ex8(10.22, 'A', 10);

	}

}

package com.constructor;

public class Ex9 {

	public Ex9(int a) {
		System.out.println(1);
	}

	public Ex9(float a, char ch) {
		this((int) a);
		System.out.println(2);
	}

	public Ex9(byte a) {
		System.out.println(3);
	}

	public Ex9(double a) {
		System.out.println(4);
	}

	public Ex9() {
		System.out.println(5);
	}

	public Ex9(double a, char ch, int x) {
		this((float) a, ch);
		System.out.println(6);
	}

	public static void main(String[] args) {

		Ex9 obj1 = new Ex9();
		Ex9 obj2 = new Ex9(10.22, 'A', 10);
		Ex9 obj3 = new Ex9();

	}

}

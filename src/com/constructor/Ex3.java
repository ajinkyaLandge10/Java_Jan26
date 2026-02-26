package com.constructor;

public class Ex3 {

	public Ex3() {

	}

	public Ex3(int a) {

	}

	public Ex3(float a, double b) {

	}

	public Ex3(byte a, long b) {

	}

	public static void main(String[] args) {

		Ex3 obj1 = new Ex3();
		Ex3 obj2 = new Ex3(10);
		Ex3 obj3 = new Ex3(10.22f, 22.3);
		Ex3 obj4 = new Ex3((byte) 10, 10);

	}

}

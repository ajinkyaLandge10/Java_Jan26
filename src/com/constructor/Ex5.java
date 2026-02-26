package com.constructor;

public class Ex5 {

	public Ex5(int a) {
		System.out.println(1);
	}

	public Ex5(int a, byte b) {
		System.out.println(2);
	}

	public Ex5(float a, long b) {
		System.out.println(3);
	}

	public Ex5(byte a) {
		System.out.println(4);
	}

	public static void main(String[] args) {

		Ex5 obj1 = new Ex5(10);
		Ex5 obj2 = new Ex5(10, (byte) 20);
		Ex5 obj3 = new Ex5(10.33f, 10);
		Ex5 obj4 = new Ex5((byte) 10);

	}

}

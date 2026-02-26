package com.polymorphism;

public class Ex4 {

	public void test1(byte a, int x, char ch, double y) {
		System.out.println(1);
	}

	public void test1(char ch, byte a, double y, int x) {
		System.out.println(2);
	}

	public static void main(String[] args) {

		Ex4 obj = new Ex4();
		// obj.test1((byte)10, 20, 'A', 10.22);
		// or
		obj.test1((byte) 10, 20, (char) 65, 10.22);
		obj.test1('B', (byte) 10, 20.3, 10);
	}

}

package com.methods;

public class Ex9 {

	public static void main(String[] args) {

		Ex9 obj = new Ex9();
		obj.test1();
		obj.test2(10, 20);
		obj.test3('A', 10.22f);
		obj.test4(10.33, 10.867f);
		obj.test5((byte) 10, (short) 20);
		obj.test6(100, 230);
		obj.test7();
		obj.test8(true, (byte) 10);

	}

	public void test1() {
		System.out.println(1);
	}

	public void test2(int a, int b) {
		System.out.println(2);
	}

	public void test3(char ch, float b) {
		System.out.println(3);
	}

	public void test4(double a, float b) {
		System.out.println(4);
	}

	public void test5(byte a, short b) {
		System.out.println(5);
	}

	public void test6(long a, int b) {
		System.out.println(6);
	}

	public void test7() {
		System.out.println(7);
	}

	public void test8(boolean a, byte b) {
		System.out.println(8);
	}

}

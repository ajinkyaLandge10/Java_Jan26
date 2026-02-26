package com.loops;

public class Ex16 {

	public static void main(String[] args) {
		Ex16 obj = new Ex16();
		obj.test(10, 20);

	}

	public void test(int num, int range) {
		for (; num <= range; num++) {
			System.out.println(num);
		}
	}

}

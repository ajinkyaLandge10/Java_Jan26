package com.methods;

public class Ex12 {

	public static void main(String[] args) {

		Ex12 obj = new Ex12();
		int s1 = obj.add(10, 20);
		// or
		float s2 = obj.add(10, 20);
		short s3 = (short) obj.add(10, 20);
		byte s4 = (byte) obj.add(10, 20);

	}

	public int add(int a, int b) {
		return a + b;
	}

}

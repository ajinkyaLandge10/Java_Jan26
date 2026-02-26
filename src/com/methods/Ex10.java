package com.methods;

public class Ex10 {

	public static void main(String[] args) {

		Ex10 obj = new Ex10();
		obj.test1(10, 22.22, (short)20);

	}

	public void test1(long a, double b, short c) {

		// float sum = (a+b+c); //error
		double s1 = (a + b + c);
		char s2 = (char) (a + b + c);
		int s3 = (int) (a + b + c);
		float f1 = (short) (a + b + c);

	}

}

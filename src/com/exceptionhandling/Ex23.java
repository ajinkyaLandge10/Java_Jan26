package com.exceptionhandling;

public class Ex23 {
	public int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		try {
			Ex23 obj = new Ex23();
			obj.div(10, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}

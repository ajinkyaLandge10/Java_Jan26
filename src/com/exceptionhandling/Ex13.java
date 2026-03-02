package com.exceptionhandling;

// Throw & Throws

public class Ex13 {
	public static void main(String[] args) {

		Ex13 obj = new Ex13();
		obj.divide();

	}

	void divide() {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

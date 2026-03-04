package com.exceptionhandling;

// Throw & Throws

public class Ex12 {
	public static void main(String[] args) {

		try {
			int a = 100, b = 2, c;
			c = a / b;
			System.out.println(c);
			try {
				int a1 = 100, b1 = 0, c1;
				c1 = a1 / b1;
				System.out.println(c1);
				try {
					int a2 = 100, b2 = 2, c2;
					c2 = a2 / b2;
					System.out.println(c2);

				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Hello");

	}

}

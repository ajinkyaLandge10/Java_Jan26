package com.exceptionhandling;

// Ways To Print Exceptions

public class Ex7 {

	public static void main(String[] args) {

		// 1st Way
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); // Exp name,Description & stack trace - Recommended
		}

		System.out.println("\n");

		// 2nd way
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e); // Exp name,Description
		}

		System.out.println("\n");

		// 3rd way
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.toString()); // // Exp name,Description
		}

		System.out.println("\n");

		// 4th way
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // // Description
		}

	}

}

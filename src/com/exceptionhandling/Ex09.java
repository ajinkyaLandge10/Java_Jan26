package com.exceptionhandling;

// Finally Block - we can use it directly with try
//				 - Used to close resources

public class Ex09 {

	public static void main(String[] args) {

		// If Exception does not Occurs
		try {
			int a = 100, b = 2, c;
			c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("Inside Finally Block");
		}

		System.out.println("\n");

		// If Exception Occurs
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("Inside Finally Block");
		}
		System.out.println("Furthur Excution");

	}

}

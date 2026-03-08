package com.exceptionhandling;

// Finally Block - it will execute always even if exception occur or not

public class Ex08 {

	public static void main(String[] args) {

		// If Exception does not Occurs
		try {
			int a = 100, b = 2, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally Block");
		}
		
		System.out.println("\n");

		// If Exception Occurs
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally Block");
		}

		

	}

}

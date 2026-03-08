package com.exceptionhandling;

public class Ex18 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Hello");
		}

	}

}

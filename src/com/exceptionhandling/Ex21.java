package com.exceptionhandling;

public class Ex21 {
	public static void main(String[] args) {

		try {
			System.out.println(1);
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[3]);
			System.out.println(2);
			try {
				System.out.println(3);
				int x = a[2] / 0;
				System.out.println(4);
			} catch (ArithmeticException e2) {
				System.out.println(5);
				System.out.println("Division by zero is not possible");
				System.out.println(6);
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(7);
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Element at such index does not exist");
			System.out.println(8);
		}
	}
}

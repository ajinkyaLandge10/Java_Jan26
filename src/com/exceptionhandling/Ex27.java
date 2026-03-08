package com.exceptionhandling;

public class Ex27 {
	public static void main(String[] args) {

		System.out.println("Starts");

		Ex27 obj = new Ex27();
		obj.div(10, 20);

		System.out.println("Ends");
	}

	public void div(int a, int b) {
		try {
			System.out.println(1);
			int div = a / b;
			System.out.println(2);

			String str = "Welcome";
			System.out.println("str = " + str.charAt(2));
			System.out.println(3);

			int arr[] = { 10, 20, -30, 40 };
			System.out.println("the res = " + arr[5]);
			System.out.println(4);

		} catch (ArithmeticException e) {
			System.out.println(5);
			System.out.println("Arithmetic Exception occurs");
			System.out.println(6);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(7);
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			System.out.println(8);

		} catch (Exception e) {
			System.out.println(9);
			System.out.println("Parent Exception occurs");
			System.out.println(10);
		}
		System.out.println("Furthur Execution");
	}
}

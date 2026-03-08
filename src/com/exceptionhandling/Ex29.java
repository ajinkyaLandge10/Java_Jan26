package com.exceptionhandling;

public class Ex29 {

	public static void main(String[] args) {

		Ex29 obj = new Ex29();
		obj.div(10, 20);
		obj.test(20, 30);

	}

	public int div(int a, int b) {
		int div = 0;

		try {
			div = a / b;
			System.out.println(div);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return div;
	}

	public void test(int a, int b) {

		try {
			int div = a / b;
			System.out.println(div); // 0
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		try {
			String str = "Pune";
			System.out.println(str.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Furthur Execution");
	}
}

package com.exceptionhandling;

public class Ex20 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Furthur Execution");
	}
}

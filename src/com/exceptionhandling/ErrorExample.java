package com.exceptionhandling;

public class ErrorExample {
	public static void main(String[] args) {

		try {
			ErrorExample.recursiveMethod(); // This will cause StackOverflowError
		} catch (StackOverflowError e) {
			System.out.println("StackOverflowError!");
			e.printStackTrace();
		}
	}

	public static void recursiveMethod() {
		// Infinite recursion will eventually cause a StackOverflowError
		recursiveMethod();
	}

}

package com.exceptionhandling;

class MyException extends Exception {
	public MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class Ex22 {
	public static void main(String[] args) {

		try {
			// Throw an object of user defined exception
			throw new MyException("My Custom Exception");
		} catch (MyException e) {
			// Print the message from MyException object
			e.printStackTrace();
		}
	}
}

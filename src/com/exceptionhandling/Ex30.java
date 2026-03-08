package com.exceptionhandling;

public class Ex30 {

	public static void main(String[] args) {
		Ex30.divideByZero();
	}

	public static void divideByZero() {
		throw new ArithmeticException("Try to divide by zero");
	}
}

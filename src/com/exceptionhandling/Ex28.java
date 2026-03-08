package com.exceptionhandling;

public class Ex28 {
	public static void main(String[] args) {
		Ex28 obj = new Ex28();
		obj.factorial(5);
	}

	public void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial of :"+num+" = "+fact);
	}
}

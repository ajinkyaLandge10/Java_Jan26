package com.arrays;

// Swapping with third Variable

public class Ex9 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");
		System.out.println("Before Swapping");
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("a = " + a);//10
		System.out.println("b = " + b);//20

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping");
		System.out.println("a = " + a); // 10 => 20
		System.out.println("b = " + b); // 20 => 10
		System.out.println("--------program ends--------");

	}

}

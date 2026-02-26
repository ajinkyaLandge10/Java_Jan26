package com.arrays;

public class Ex2 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");

		int[] arr = { 10, 20, -30, 40, 80 };
		// or
		// int arr[] = {10,20,-30,40,80};

		System.out.println("Accessing any elelements from array");

		System.out.println("array at index 3 = " + arr[3]); // 40
		// System.out.println("array at index 9 = " + arr[9]); // ArrayIndexOutOfBound (AIOB)exception

		System.out.println("Array length");
		System.out.println("length = " + arr.length);

		
		System.out.println("printing all values");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i = " + arr[i]);
		}

		// sum
		int sum = arr[0] + arr[1];
		System.out.println("sum = " + sum); // 10+20 = 30

		System.out.println("--------program ends--------");

	}

}

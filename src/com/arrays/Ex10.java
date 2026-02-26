package com.arrays;

// Swapping with third Variable

public class Ex10 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");
		int[] arr = { 20, 10, 30, 50, 0 };

		int size = arr.length;
		System.out.println("Before sorting");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		// operation
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {

				if (arr[i] > arr[j]) {

					// swapping logic

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------program ends--------");

	}

}

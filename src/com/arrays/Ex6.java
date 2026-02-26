package com.arrays;

public class Ex6 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");
		int[] arr = { 50, 10, 60, 80, 70, -10 };

		int size = arr.length;

		System.out.println("Before sorting");

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		// operation
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

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

package com.arrays;

public class Ex5 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");
		int[] arr = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// logic
				if (arr[i] == arr[j]) {// true
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println("--------program ends--------");

	}

}

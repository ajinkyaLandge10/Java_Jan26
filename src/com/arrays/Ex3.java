package com.arrays;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");

		int[] arr = { 10, 20, 40, 80 };

		int size = arr.length;

//		for(int i =0; i<size; i++) {
//			System.out.println(arr[i]);
//		}

		int i = 0;
		for (; i < size; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("--------program ends--------");

	}

}

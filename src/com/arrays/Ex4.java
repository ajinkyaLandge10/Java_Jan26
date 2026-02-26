package com.arrays;

public class Ex4 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");

		int[] originalData = { 50, 0, 10, 0, 0, 70, 99, 0, 3, 0, 33 };
		// 11-6 = 5
		// {50,10,70,99,3,33,0,0,0,0,0}

		int[] expectedData = new int[originalData.length];

		int index = 0;

		for (int i = 0; i < originalData.length; i++) {
			// logic
			if (originalData[i] != 0) {
				expectedData[index] = originalData[i];
				index++;
			}
		}

		System.out.println("result --> ");

		for (int i = 0; i < expectedData.length; i++) {
			System.out.println("the value of expected data = " + expectedData[i]);
		}

		System.out.println("--------program ends--------");

	}

}

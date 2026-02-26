package com.arrays;

// Swapping with third Variable

public class Ex11 {

	public static void main(String[] args) {

		System.out.println("--------program starts--------");
		int[][] arr = new int[3][5];

		// rows = 3
		// columns = 5

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		arr[0][4] = 50;

		arr[1][0] = 60;
		arr[1][1] = 70;
		arr[1][2] = 80;
		arr[1][3] = 90;
		arr[1][4] = 100;

		arr[2][0] = 110;
		arr[2][1] = 120;
		arr[2][2] = 123;
		arr[2][3] = 145;
		arr[2][4] = 109;

		System.out.println(arr.length); // 3

		System.out.println(arr[0].length);

		for (int i = 0; i < arr.length; i++) { // number of rows
			for (int k = 0; k < arr[i].length; k++) {
				System.out.println(arr[i][k]);
			}
			System.out.println(); // move to next line after each row
		}
		System.out.println("--------program ends--------");

	}

}

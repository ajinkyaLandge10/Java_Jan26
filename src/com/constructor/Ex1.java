package com.constructor;

public class Ex1 {

	int x;

	public Ex1(int y) { // 10
		this.x = y; // 10
	}

	public static void main(String[] args) {

		Ex1 obj = new Ex1(10);
		System.out.println(obj.x); // 10

	}

}

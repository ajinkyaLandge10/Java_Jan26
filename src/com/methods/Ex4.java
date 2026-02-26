package com.methods;

public class Ex4 {

	public static void main(String[] args) {

		Ex4 obj = new Ex4();
		obj.add(10, 20);

	}

//	public void add() { // without argument
//		int a = 10, b = 20;
//		int sum = a + b;
//		System.out.println(sum);
//
//	}

	public void add(int a, int b) { // with argument
		int sum = a + b;
		System.out.println(sum);

	}

}

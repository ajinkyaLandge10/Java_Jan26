package com.methods;

public class Ex5 {

	public static void main(String[] args) {

		Ex5 obj = new Ex5();
		int sum = obj.add(10, 20);
		System.out.println(sum);

	}

//	public void add() {  //without argument
//		int a =10, b =20;
//		int sum = a+b;
//		System.out.println(sum);
//		
//	}

//	public void add(int a, int b) {  //with argument
//		int sum = a+b;
//		System.out.println(sum);
//		
//	}

	public int add(int a, int b) {
		// int sum = a+b;
		return a + b;

	}

}

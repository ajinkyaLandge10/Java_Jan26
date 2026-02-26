package com.methods;

public class Ex2 {

	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		obj.commonMethod();

		System.out.println(1);
		System.out.println(2);

		obj.commonMethod();
		System.out.println(3);
		System.out.println(4);

		obj.commonMethod();
		System.out.println(5);
		System.out.println(6);

		obj.commonMethod();
		System.out.println(7);
		System.out.println(8);

	}

	public void commonMethod() {
		System.out.println("Hi");
		System.out.println("Students");
		System.out.println("welcome Back");
	}

}

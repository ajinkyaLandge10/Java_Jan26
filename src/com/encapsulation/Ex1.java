package com.encapsulation;

public class Ex1 {

	private int a = 10, b = 20;

	public static void main(String[] args) {

		Ex1 obj = new Ex1();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}

//concept : data hiding --> cannot access directly from other classes
//accessible within the class
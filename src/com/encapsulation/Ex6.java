package com.encapsulation;

class P1 {

	private int a = 10, b = 20;

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

}

public class Ex6 {
	
	public static void main(String[] args) {
		P1 obj = new P1();

		System.out.println(obj.getA()); // 10
		System.out.println(obj.getB()); // 20

		int sum = obj.getA() + obj.getB();
		System.out.println(sum);

	}
}

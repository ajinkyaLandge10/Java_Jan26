package com.encapsulation;

class P4 {
	private int a = 10, b = 20;

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int x) { // 5
		System.out.println("setA");
		a = x; // 5
	}
	public void setB(int y) { // 6
		System.out.println("SetB");
		b = y; // 6
	}

}

public class Ex9 {
	public int a = 10, b = 20;

	public static void main(String[] args) {

		P4 obj = new P4();

		System.out.println(obj.getA()); // 10
		System.out.println(obj.getB()); // 20

		obj.setA(5);
		obj.setB(6);

		System.out.println(obj.getA()); // 5
		System.out.println(obj.getB()); // 6

	}

}

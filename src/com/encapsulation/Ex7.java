package com.encapsulation;

class P2 {
	private int a = 10, b = 20;

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA() {
		System.out.println("setA");
		this.a = 100;
	}
	public void setB() {
		System.out.println("SetB");
		this.b = 200;
	}

}

public class Ex7 {
	
	public static void main(String[] args) {

		P2 obj = new P2();

		System.out.println(obj.getA()); // 10
		System.out.println(obj.getB()); // 20

		obj.setA();
		obj.setB();

		System.out.println(obj.getA()); // 100
		System.out.println(obj.getB()); // 200

	}

}

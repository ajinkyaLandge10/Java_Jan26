package com.inheritance;

class X1 {

	public X1() {
		super();
		System.out.println("A1");
	}
}

class X2 extends X1 {

	public X2() {
		super();
		System.out.println("A2");
	}
}

public class Ex6 extends X2 {

	public Ex6() {
		super();
		System.out.println("Ex6");
	}

	public static void main(String[] args) {

		Ex6 obj = new Ex6();
	}

}

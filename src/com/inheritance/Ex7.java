package com.inheritance;

class Z1 {

	public Z1(int a) {
		super();
		System.out.println("Z1");
	}
}

class Z2 extends Z1 {

	public Z2(double x) {
		super((int)x);
		System.out.println("Z2");
	}
}

public class Ex7 extends Z2 {

	public Ex7() {
		super(90);
		System.out.println("Ex7");
	}

	public static void main(String[] args) {

		Ex7 obj = new Ex7();
	}

}

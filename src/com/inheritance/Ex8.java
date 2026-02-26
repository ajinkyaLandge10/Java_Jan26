package com.inheritance;

class Emp {
	public float x = 1000;
}

public class Ex8 extends Emp {

	public int bonus = 7000;

	public static void main(String[] args) {

		Ex8 obj = new Ex8();
		System.out.println(obj.bonus);
		System.out.println(obj.x);
	}

}

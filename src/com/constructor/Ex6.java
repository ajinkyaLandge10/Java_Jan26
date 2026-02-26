package com.constructor;

public class Ex6 {

	int x = 70;

	public Ex6() {
		System.out.println(1);
	}

	public Ex6(int a) {
		System.out.println(2);
	}

	public Ex6(Ex6 a) {
		System.out.println(3);

		a.x = 700;
	}

	public static void main(String[] args) {

		Ex6 obj1 = new Ex6();
		System.out.println(obj1.x); // 70
		
		Ex6 obj2 = new Ex6(10);// a

		Ex6 obj3 = new Ex6(obj1);
		System.out.println(obj3.x);// 70
		System.out.println(obj1.x); // 700

	}

}

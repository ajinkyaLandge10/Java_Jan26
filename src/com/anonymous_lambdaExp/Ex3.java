package com.anonymous_lambdaExp;

//Normal Interface Implementation

interface I {
	abstract int add(int x, int y);
	abstract int greater(int x, int y);
}

class ITest implements I {

	public int add(int x, int y) {
		return x + y;
	}
	public int greater(int x, int y) {
		return x > y ? x : y;
	}

}

public class Ex3 {

	public static void main(String[] args) {

		ITest obj = new ITest();
		System.out.println("Addition is : "+obj.add(10, 20));
		System.out.println("Greater is : "+obj.greater(10, 20));
	}

}

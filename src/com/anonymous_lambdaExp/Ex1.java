package com.anonymous_lambdaExp;

// Normal Abstract class Implementation

abstract class PrintData {
	abstract int add(int x, int y);

	abstract int greater(int x, int y);
}

class Test extends PrintData {
	int add(int x, int y) {
		return x + y;
	}

	int greater(int x, int y) {
		return (x > y ? x : y);
	}

}

public class Ex1 {

	public static void main(String[] args) {

		PrintData pd = new Test();
		System.out.println("Addition is : " + pd.add(10, 20));
		System.out.println("Greater is : " + pd.greater(10, 20));
	}

}

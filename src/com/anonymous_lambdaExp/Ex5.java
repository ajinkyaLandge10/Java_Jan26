package com.anonymous_lambdaExp;

//Interface implementation using Lambda Expression

@FunctionalInterface
interface I2 {
	abstract int add(int x, int y);
}

public class Ex5 {

	public static void main(String[] args) {
		I2 obj = (int x, int y)->(x+y);
		System.out.println("Addition is : " + obj.add(30, 40));
	}

}

package com.anonymous_lambdaExp;

// Abstract class implementation using Anonymous Class

abstract class PrintData1 {
	abstract int add(int x, int y);
	abstract int greater(int x, int y);
}

public class Ex2 {

	public static void main(String[] args) {

		PrintData1 pd =new PrintData1() {
			int add(int x, int y) {
				return x+y;
			}
			int greater(int x, int y) {
				return (x>y?x:y);
			}
		};
	
		System.out.println("Addition is :"+pd.add(30, 40));
		System.out.println("Greater is "+pd.greater(30, 40));
	}

}

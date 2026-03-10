package com.anonymous_lambdaExp;

//Interface implementation using Anonymous Class

interface I1 {
	abstract int add(int x, int y);
	abstract int greater(int x, int y);
}

public class Ex4 {

	public static void main(String[] args) {

		I1 obj = new I1() {
			public int add(int x, int y) {
				return x+y;
			}
			public int greater(int x, int y) {
				return x>y?x:y;
			}

		};
		
		System.out.println("Addition is : " + obj.add(30, 40));
		System.out.println("Greater is : " + obj.greater(30, 40));
	}

}

package com.conditionalstatements;

public class ifElseIfExample2 {

	public static void main(String[] args) {
		int marks =95;
		if(marks > 90) {
			System.out.println(marks+" = "+"Grade A");
		}else if(marks > 70) {
			System.out.println(marks+" = "+"Grade B");
		}else if(marks >35) {
			System.out.println(marks+" = "+"Grade C");
		}else {
			System.out.println(marks+" = "+"Fail");
		}

	}

}

package com.loopingstatement;

public class DoWhileLoop {

	public static void main(String[] args) {
//		Print 1 to 10 	
		int i =1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);

		System.out.println("----------------------");

		int num = 4;
		do {
			if(num%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("Number is Odd");
			}break;
		}while(true);
		
		
	}

}

package com.loops;

public class Ex6 {

	public static void main(String[] args) {

		for (char ch ='R' ; ch<='d';ch++) {
			System.out.println(ch+ " : " + (int)ch);
		}
		
		System.out.println("----------------");
		for (char ch ='k' ; ch<='z';ch++) {
			System.out.println(ch+ " : " + (int)ch);
		}
		
		System.out.println("----------------");
		for (char ch ='R' ; ch>='D';ch--) {
			System.out.println(ch+ " : " + (int)ch);
		}
	}

}

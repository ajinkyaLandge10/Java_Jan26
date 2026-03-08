package com.String;

//  String Methods - toUpperCase, toLowerCase, String.valueOf, toCharArray

public class Ex6 {

	public static void main(String[] args) {

//		toUpperCase - Converts all to Upper-case
//		toLowerCase() - Converts all to Lower-case
//		String.valueOf() - Converts int to string
//		toCharArray()() - Converts String to character array

		String s = "Ajiinkya";
		System.out.println(s.toUpperCase()); // AJIINKYA
		System.out.println(s.toLowerCase()); // ajiinkya

		System.out.println("-----------------");
		int a = 10, b=20;
		System.out.println(a+b);
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		System.out.println(s1+s2);

		System.out.println("-----------------");
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'n') {
				break;
			}
			System.out.println(c[i]);
		}
		
	}

}

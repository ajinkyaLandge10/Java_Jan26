package com.String;

//  String Methods - indexOf, lastIndexOf, contains, charAt, startsWith, endWith

public class Ex5 {

	public static void main(String[] args) {

//		indexOf - returns int _ Gives index position of given char
//		lastIndexOf() - returns int _ Gives index position of char from last
//		contains() - returns boolean _ Gives true/false
//		charAt() - return char
//		startsWith() - return boolean
//		endWith() - return boolean

		String s = "Ajiinkya";
		System.out.println(s.indexOf("i")); // 2
		System.out.println(s.lastIndexOf("i")); // 3
		System.out.println(s.indexOf("x")); //-1
		System.out.println(s.contains("nk")); // true
		System.out.println(s.charAt(5)); // k
		System.out.println(s.startsWith("A")); // true
		System.out.println(s.endsWith("p")); // false

	}

}

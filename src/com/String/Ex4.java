package com.String;

//  String Methods - replace, replaceFirst, replaceAll

public class Ex4 {

	public static void main(String[] args) {
	
//		replace() - replace old string with new string
//		replaceFirst() - replace only first matching string
//		replaceAll() - replace All matching string with new string
//		the difference between replace and replace all is we can use regex in replaceAll
		
		String s1 = "this is demo";
		System.out.println(s1.replace("is", "was"));  // thwas was demo
		System.out.println(s1.replaceFirst("is", "was"));  //thwas is demo
		System.out.println(s1.replaceAll("is", "was"));  //thwas was demo
		System.out.println(s1.replaceAll("is(.)", "was")); //thwaswasdemo
		System.out.println(s1.replaceAll("is(.*)", "was"));  //thwas
		

	}

}

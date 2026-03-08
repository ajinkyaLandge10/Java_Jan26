package com.String;

//  String Methods - Length, isEmpty, trim

public class Ex3 {

	public static void main(String[] args) {

//		.length() - returns int  & not valid for null strings
		String name = "abc";
		System.out.println(name.length()); // 3
		int i = name.length();
		if (i == 0) {
			System.out.println("name is empty");
		} else {
			System.out.println("Valid name");
		}

		String email = "abc@gmail.com";
		System.out.println(email.length()); // 13

		System.out.println("-----------------------");
			
//		.isEmpty() - returns boolean  & not valid for null strings
		String name1 = "abc";
		System.out.println(name1.isEmpty());
		if(name1.isEmpty()) {
			System.out.println("name is empty");
		}else {
			System.out.println("name is not empty");
		}
		
		System.out.println("-----------------------");
		
//		.trim() - returns String - removes side spaces only not middle
		String A ="   ab  c";
		System.out.println(A);
		System.out.println(A.trim());
	
		
		

	}

}

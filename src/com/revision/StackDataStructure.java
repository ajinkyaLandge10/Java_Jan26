package com.revision;

import java.util.Stack;

/*
 	  Stack DataStructure
	- It is a LIFO DS (Last In First Out) Ex: Stack of books/plates
	- Stores Objects in sort of Vertical tower
	- push() to add on Top
	- pop() to remove from top
*/
public class StackDataStructure {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		System.out.println(st.empty()); // True - as stack is Empty

		st.push("BMW"); // - Add item to stack
		st.push("Honda");
		st.push("Audi");
		st.push("Tata");
		System.out.println(st.empty()); // False - as stack is not Empty

		System.out.println(st);

		st.pop(); // - remove item from stack
		System.out.println(st); // [BMW, Honda, Audi]

		System.out.println(st.peek()); // Audi - Gives topmost item on stack
		System.out.println(st.search("Audi")); // 1
		System.out.println(st.search("Honda")); // 2
		System.out.println(st.search("BMW")); // 3
		System.out.println(st.search("Tata")); // -1

//		for(int i=0 ;i<=1000000000;i++) { //OutOfMemoryError: Java heap space
//			st.push("Hyundai");
//		}

	}

}

package com.switchh;

public class Ex1 {

	public static void main(String[] args) {
		char ch = 'A';

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " - is a Vowel");
			break;
		default:
			System.out.println(ch + " - is a Consonant");
		}

	}

}

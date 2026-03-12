package org.logicalProgs;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String s = sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			rev= rev+s.charAt(i);
		}
		System.out.println("Reverse : "+rev);
		
		if(s.equals(rev)){
			System.out.println("It is Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

}

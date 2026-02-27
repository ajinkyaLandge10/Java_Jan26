package com.arrays;


public class Ex12 {

	public static void main(String[] args) {

		char [] ch = {'A','J','I','N','K','Y','A'};
		
		String str = new String(ch);
		System.out.println(str);
		
		for(int i=0 ;i<ch.length ; i++) {
			System.out.print(ch[i]);
		}
	}

}

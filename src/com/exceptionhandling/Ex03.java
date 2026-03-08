package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\n");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\n");
		
		try {
			int a = 100, b = 0, c;
			c= a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\n");
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}

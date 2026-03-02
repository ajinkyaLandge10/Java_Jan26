package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

// Finally Block - Used to close resources
				 
public class Ex10 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:/abc.txt");
		} catch (Exception e) {
			System.out.println("File Not Found");
		} finally {
			if (fis != null) {
				fis.close();
			}
			System.out.println("FIle Closed");

		}

	}

}

package com.switchh;

public class Ex3 {

	public static void main(String[] args) {
		
		String Browser = "OPERA";
		
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is Opening");
			break;
		case "firefox":
			System.out.println("Firefox is Opening");
			break;
		case "edge":
			System.out.println("Edge is Opening");
			break;
		case "safari":
			System.out.println("Safari is Opening");
			break;

		default:
			System.out.println("Invalid Browser - "+Browser);
			break;
		}

	}
}
package com.conditionalstatements;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		String day = "February         ";
		
		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("Working Day");
			break;
		case "tuesday":
			System.out.println("Working Day");
			break;
		case "wednesday":
			System.out.println("Working Day");
			break;
		case "thursday":
			System.out.println("Working Day");
			break;
		case "friday":
			System.out.println("Working Day");
			break;
		case "saturday":
			System.out.println("Working Day");
			break;
		case "sunday":
			System.out.println("Working Day");
			break;

		default:
			System.out.println("Invalid Day");
			break;
		}
		

	}

}

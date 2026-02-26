package com.switchh;

public class Ex2 {

	public static void main(String[] args) {
		String day = "Monday";

		switch (day.toLowerCase()) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println(day + " - is a Working Day");
			break;
		case "saturday":
		case "sunday":
			System.out.println(day + " - is a Holiday");
			break;

		}

	}
}
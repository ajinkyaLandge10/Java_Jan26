package com.constructor;

public class Ex4 {

	int modelYear;
	String modelName;

	public Ex4(int year, String name) {
		this.modelYear = year;
		this.modelName = name;
	}

	public static void main(String[] args) {

		Ex4 obj = new Ex4(2026, "ABC");
		System.out.println(obj.modelYear);
		System.out.println(obj.modelName);

	}

}

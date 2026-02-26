package com.this_super;

// this keyword -->

class Test {
	int i;

	void setValue(int i) {
		this.i = i;  // if we don't use this keyword i = i it treats both variables as local
	} 		    // and Instance variable shows default value

	void show() {
		System.out.println(i);
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.setValue(10);
		obj.show();
	}

}

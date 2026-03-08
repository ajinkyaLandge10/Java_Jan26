package com.extraquestions;

class Sport {
	public void play() {
		System.out.println("Play Sport");
	}
}

class Cricket extends Sport {
	public void play() {
		System.out.println("Play Cricket");
	}
}

class Football extends Sport {
	public void play() {
		System.out.println("Play Football");
	}
}

class Hockey extends Sport {
	public void play() {
		System.out.println("Play Hockey");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Sport s1 = new Cricket();
		Sport s2 = new Football();
		Sport s3 = new Hockey();
		
		s1.play();
		s2.play();
		s3.play();
	}

}

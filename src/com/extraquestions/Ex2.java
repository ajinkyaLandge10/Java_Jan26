package com.extraquestions;

class Sport1 {
	public void play() {
		System.out.println("Play Sport");
	}
}

class Cricket1 extends Sport1 {
	public void play() {
		System.out.println("Play Cricket");
	}
}

class Football1 extends Sport1 {
	public void play() {
		System.out.println("Play Football");
	}
}

class Hockey1 extends Sport1 {
	public void play() {
		System.out.println("Play Hockey");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Sport1[] games = { new Cricket1(), new Football1(), new Hockey1() };
		// or
		for (Sport1 x : games) {
			x.play();
		}
	}

}

package com.revision;

class Counter {
	int count;

	public void increment() {
		count++;
	}
}

public class Sync {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <=1000; i++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <=1000; i++) {
					c.increment();
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <=1000; i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Counter : "+ c.count);

	}

}

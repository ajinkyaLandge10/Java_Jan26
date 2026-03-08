package org.assignments;

/* Methods in Object Class-

01] - toString() - Returns a string representation of the object (usually class name + hashcode).
02] - equals(Object obj) - Compares two objects to check if they are logically equal.
03] - hashCode() - Returns a unique hash value used in hashing collections like HashMap.
04] - getClass() - Returns the runtime class information of the object.
05] - clone() - Creates and returns a copy of the object.
06] - finalize() - Called by the garbage collector before destroying the object (deprecated now).
07] - wait() - Causes the current thread to wait until another thread notifies it.
08] - wait(long timeout) - Makes the thread wait for a specific time or until notified.
09] - wait(long timeout, int nanos) - Makes the thread wait with millisecond and nanosecond precision.
10] - notify() - Wakes up one thread waiting on the object's monitor.
11] - notifyAll() - Wakes up all waiting threads on the object's monitor.

*/

class Assignment_4 implements Cloneable {
	int value = 10;

	// overriding toString()
	public String toString() {
		return "Demo object with value = " + value;
	}

	// overriding equals()
	public boolean equals(Object obj) {
		Assignment_4 d = (Assignment_4) obj;
		return this.value == d.value;
	}

	// overriding clone()
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// overriding finalize()
	protected void finalize() {
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) throws Exception {

		Assignment_4 obj1 = new Assignment_4();
		Assignment_4 obj2 = new Assignment_4();

		// toString()
		System.out.println(obj1.toString());

		// equals()
		System.out.println("Objects equal: " + obj1.equals(obj2));

		// hashCode()
		System.out.println("Hashcode of obj1: " + obj1.hashCode());

		// getClass()
		System.out.println("Class name: " + obj1.getClass());

		// clone()
		Assignment_4 obj3 = (Assignment_4) obj1.clone();
		System.out.println("Cloned object: " + obj3);

		// wait(), notify(), notifyAll()
		Thread t1 = new Thread(() -> {
			synchronized (obj1) {
				try {
					System.out.println("Thread waiting...");
					obj1.wait(2000); // wait with timeout
					System.out.println("Thread resumed");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println("Thread notifying...");
				obj1.notify();
				obj1.notifyAll();
			}
		});

		t1.start();
		Thread.sleep(500);
		t2.start();
	}
}

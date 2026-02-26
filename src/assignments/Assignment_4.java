package assignments;

public class Assignment_4 {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
//		1] public final native Class<?> getClass();
//		-getClass() returns the runtime class (actual class type) of the object,
		
		String S = "Hello";
		System.out.println(S.getClass());
		
		Integer I = 321;
		System.out.println(I.getClass());
		
		
//		2] public native int hashCode();
//		- Returns an integer value that represents an object.
//		- used in collection to store and find objects
		
		String a = "Hello Java";
		String b = "Hello Java";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode()); 
		
		
//		3] public boolean equals(Object obj) {
//	        return (this == obj);
//	       }
		
		String a1 = new String("Java");
		String b1 = new String("Java");

		System.out.println(a1.equals(b1)); // true (String overrides equals)
		System.out.println(a1 == b1);      // false (different objects)
		
//		4] protected native Object clone() throws CloneNotSupportedException;
//		clone() creates and returns a copy of the current object
		
//		class Test implements Cloneable {
//		    int x = 10;
//
//		    public static void main(String[] args) throws Exception {
//		        Test t1 = new Test();
//		        Test t2 = (Test) t1.clone();
//		        System.out.println(t2.x); // 10
//		    }
//		}

//		5] public String toString() {
//	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	    }
//		-returns a string representation of the object containing the class name and its hash code.

//		class Test {
//		    public static void main(String[] args) {
//		        Test t = new Test();
//		        System.out.println(t.toString());
//		    }
//		}
//		O/P - Test@15db9742
		
//		6] public final native void notify();
//		- notify() is used in thread communication.
//		  It wakes up one thread that is waiting on that object.
		
//		7] public final native void notifyAll();
//		- notifyAll() wakes up all threads that are waiting on that object's monitor instead of just one.
		
//		8] public final void wait() throws InterruptedException {
//	        wait(0L);
//	    }
//		- wait() makes the current thread pause and release the object's lock until another thread calls notify() or notifyAll().
		
		
		
		
		
		
		
		
		
		
	}

}

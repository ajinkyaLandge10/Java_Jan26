package com.revision;

import java.util.LinkedList;
import java.util.Queue;

/*
 	  Queue DataStructure
	- It is a FIFO DS (First In First Out) Ex: Line of People
	- enqueue, offer() to add
	- dequeue, poll() to remove
*/
public class QueueDataStructure {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<String>();
		System.out.println(q.isEmpty()); // True - Method from collection 
		
		q.offer("First");  // Add item to Queue
		q.offer("Second");
		q.offer("Third");
		q.offer("Fourth");
		
		System.out.println(q.isEmpty()); // False
		System.out.println(q.size()); //4
		System.out.println(q.contains("Fourth")); // True
		System.out.println(q.contains("Sixth")); //false
		
		System.out.println(q); //[First, Second, Third, Fourth]
		System.out.println(q.peek());//First - Gives First item on Queue
		
		q.poll(); // removes first item in Queue
		System.out.println(q);//[Second, Third, Fourth]
		
		q.poll();
		q.poll();
		q.poll();
//		q.element(); //Element method throws -NoSuchElementException
		q.poll(); // don't throw any exception
		System.out.println(q);
		

	}

}

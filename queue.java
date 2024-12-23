package com.java.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queue {
public static void main(String[] args) {
	PriorityQueue q = new PriorityQueue();
	//Adding Elements add() or Offer()
	q.add(50);
	q.add(10);
	q.offer(30);
	q.offer(20);//heterogenious data not allowed
	System.out.println(q);//insertion order preserved and duplicates allowed
	//get header Element element() or Peek()
	System.out.println("Peek Method : "+q.peek());//if no element return null
	System.out.println("Element Method : "+q.element());//if no element return exception
	//return and remove element poll() and remove()
	
	System.out.println("Remove Method : "+q.remove());//exception
	System.out.println(q);
	System.out.println("Poll Method : "+q.poll());//null
	System.out.println(q);
	Iterator it = q.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("Using ForEach Loop");
	for(Object o:q) {
		System.out.println(o);
	}
}
}

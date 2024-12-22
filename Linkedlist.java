package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	//LinkedList<String> l = new LinkedList<String>();
	l.add(120);
	l.add(240);
	l.add("Data");
	l.add("Value");
	l.add(15.5);
	l.add('A');
		System.out.println(l);	
		System.out.println("Total Size : "+l.size());
		System.out.println("The Element need to Removed : "+l.remove(3));
		System.out.println("After Removing : " +l);
		l.add(2,"JAVA");
		System.out.println("Adding at specific Index : " +l);
		System.out.println("Getting Value using Index : " +l.get(3));
		l.set(0, "DOCKER");
		System.out.println("After Updating"+l);	
		System.out.println(l.contains("DOCKER"));
		System.out.println("Check If Empty : "+l.isEmpty());
		System.out.println("__________________________________________");
		for(int i=0;i<l.size();i++) {
			System.out.println("Get All value :"+l.get(i));
		}
		System.out.println("__________________________________________");
		for(Object e:l) {
			System.out.println(e);	
		}
		System.out.println("__________________________________________");
		//using Iterator method
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("__________________________________________");
}
}

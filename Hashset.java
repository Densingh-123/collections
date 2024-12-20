package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();//default capacity 16 bits and load-factor id 0.75 
	//HashSet hs=new HashSet(100);
	//HashSet hs=new HashSet(100,(float)0.90);//custamize load Factor
	//HashSet <Integer>hs=new HashSet<Integer>(100);
	hs.add(120);
	hs.add(220);
	hs.add(320);
	hs.add(420);
	hs.add(520);
	hs.add(620);
	hs.add(720);
	hs.add(820);
	System.out.println(hs);
	 System.out.println("__________________________________________");
	hs.remove(320);
	System.out.println("After Removing"+hs);
	System.out.println(hs.contains(720));
	System.out.println(hs.isEmpty());
	 System.out.println("__________________________________________");
	for(Object data:hs) {
		System.out.println(data);
	}
	 System.out.println("__________________________________________");
	 Iterator it = hs.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 System.out.println("__________________________________________");
}
}

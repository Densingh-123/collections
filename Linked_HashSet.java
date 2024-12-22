package com.java.collections;

import java.util.LinkedHashSet;

public class Linked_HashSet {
public static void main(String[] args) {
	 //does not allow duplicates and insertion order Preserved
	LinkedHashSet lh = new LinkedHashSet();
	lh.add(23);
	lh.add(33);
	lh.add(43); 
	lh.add(53);
	lh.add(33);
	System.out.println("Insertion Order : "+lh);
}
}

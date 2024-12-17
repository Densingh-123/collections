package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
System.out.println(al.size());
al.add(129);
al.add(12);
al.add(23);
al.add(29);
System.out.println(al.indexOf(12));
al.add("data");
al.add(1,"Dens");
System.out.println(al);
System.out.println(al.contains("Dens"));
System.out.println(al.get(2));
System.out.println(al.remove(3));
System.out.println(al.set(2,34));
System.out.println(al.indexOf(29));
System.out.println(al);
ArrayList al2 = new ArrayList();
al2.addAll(al);
al2.addAll(3,al);
System.out.println(al2);
List al3 = al2.subList(0, 4);
al3.removeAll(al2);
System.out.println(al3);

	}

}

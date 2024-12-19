package com.java.collections;

import java.util.Hashtable;

public class Hash_Table {
public static void main(String[] args) {
	//only one thread allowed at a time thread safe null cannot accept 
	Hashtable m = new Hashtable();//capacity is 11 and load factor 0.75
	m.put(101, "Dens");
    m.put(102, "David");
    m.put(103, "Rajesh");
    m.put(104, "Ramesh");
    m.put(105, "Depak");
    System.out.println(m);
    System.out.println(  m.get(105));
    m.remove(103);
    System.out.println(m);
    System.out.println("__________________________________________");
    System.out.println(m.containsKey(101));
    System.out.println(m.containsKey(103));
    System.out.println(m.containsValue("David"));
    System.out.println(m.isEmpty());
    System.out.println("__________________________________________");
    System.out.println(m.keySet());
    System.out.println(m.values());
    System.out.println(m.entrySet());
    System.out.println("__________________________________________");
}
}

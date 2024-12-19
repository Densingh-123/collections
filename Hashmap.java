package com.java.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Hashmap {
	 public static void main(String[] args) {
	        HashMap<Integer, String> m = new HashMap<>();
	        m.put(101, "Dens");
	        m.put(102, "David");
	        m.put(103, "Rajesh");
	        m.put(104, "Ramesh");
	        m.put(105, "Depak");
	        //if duplicate key insert it update latest data
	        m.put(105, "Suresh");
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
	      for(int i:m.keySet()) {
	    	  System.out.println(i);
	      }
	      System.out.println("__________________________________________");
	      for(String i:m.values()) {
	    	  System.out.println(i);
	      }
	      System.out.println("__________________________________________");
	      for(int i:m.keySet()) {
	    	  System.out.println(i+" - "+m.get(i));
	      }
	      System.out.println("__________________________________________");
	      for (Map.Entry<Integer, String> data : m.entrySet()) {
	    	    System.out.println(data.getKey() + " - " + data.getValue());
	    	}
	      System.out.println("__________________________________________");
	      Set<Map.Entry<Integer, String>> st = m.entrySet();
	        Iterator<Map.Entry<Integer, String>> it = st.iterator();

	        while (it.hasNext()) {
	            Map.Entry<Integer, String> entry = it.next();
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	    }
}

package com.java.collections;

import java.util.LinkedList;

public class LinkedLists {
   LinkedList <Integer>li;
   public LinkedLists() {
	   li=new LinkedList<>();
	   li.add(2);
	   li.add(3);
	   li.add(190);
	   li.add(234);
	   li.poll();
//	   li.clear();
	   li.offerFirst(2345);
LinkedList ll2 = (LinkedList)li.clone();
System.out.println(ll2);
    }
   public void Display() {
	   System.out.println(li);
	  
   }
	   public static void main(String[] args) {
		   LinkedLists obj= new LinkedLists();
		   obj.Display();
	   }
   }


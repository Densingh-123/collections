package com.java.collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist_1 {
    public static void main(String[] args) {
        // Using generics to specify the type of elements in the LinkedList
        LinkedList<Character> l = new LinkedList<>();
        
        // Adding elements to the LinkedList
        l.add('A');
        l.add('X');
        l.add('Z');
        l.add('E');
        l.add('N');
        l.add('S');
        l.add('L');

        // Creating a new LinkedList and copying elements from the original LinkedList
        LinkedList<Character> l1 = new LinkedList<>();
        l1.addAll(l);
        
        // Display the list before any operations
        System.out.println("Before Sorting: " + l1);

        // Sorting the list in natural order (ascending)
        Collections.sort(l1);
        System.out.println("After Sorting: " + l1);

        // Sorting the list in reverse order (descending)
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("After Reverse Sorting: " + l1);

        // Shuffling the list (randomizing the order)
        Collections.shuffle(l1);
        System.out.println("After Shuffling: " + l1);
        System.out.println("__________________________________________");
        LinkedList<String> l2 = new LinkedList<>();
        l2.add("LION");
        l2.add("TIGER");
        l2.add("GIRAFFE");
        System.out.println(l2);
        l2.addFirst("Dragon");
        l2.addLast("PEACOCK");
        System.out.println("After Adding: " + l2);
        System.out.println("__________________________________________");
        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());
        System.out.println("__________________________________________");
        //remove
        System.out.println(l2.removeFirst());
        System.out.println(l2);
        System.out.println("__________________________________________");
        System.out.println(l2.removeLast());
        System.out.println(l2);
        System.out.println("__________________________________________");
    }
}

package com.java.collections;

import java.util.HashSet;

public class Hashset_1 {
    public static void main(String[] args) {
        // Create and initialize first HashSet
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(52);
        hs.add(42);
        hs.add(32);
        hs.add(22);
        hs.add(12);
        System.out.println("HashSet hs: " + hs);

        // Create a copy of the first HashSet
        HashSet<Integer> hs_1 = new HashSet<Integer>();
        hs_1.addAll(hs);
        System.out.println("Copy of HashSet hs: " + hs_1);

        // Initialize two additional HashSets for union and intersection operations
        HashSet<Integer> set_1 = new HashSet<Integer>();
        set_1.add(10);
        set_1.add(20);
        set_1.add(30);
        set_1.add(40);
        set_1.add(50);
        set_1.add(60);
        System.out.println("HashSet set_1: " + set_1);

        HashSet<Integer> set_2 = new HashSet<Integer>();
        set_2.add(70);
        set_2.add(80);
        set_2.add(90);
        set_2.add(30);
        set_2.add(40);
        set_2.add(50);
        set_2.add(60);
        System.out.println("HashSet set_2: " + set_2);

        // Union operation
        HashSet<Integer> unionSet = new HashSet<>(set_1);
        unionSet.addAll(set_2);
        System.out.println("Union of set_1 and set_2: " + unionSet);

        // Intersection operation
        HashSet<Integer> intersectionSet = new HashSet<>(set_1);
        intersectionSet.retainAll(set_2);
        System.out.println("Intersection of set_1 and set_2: " + intersectionSet);

        // Difference operation
        HashSet<Integer> differenceSet = new HashSet<>(set_1);
        differenceSet.removeAll(set_2);
        System.out.println("Difference of set_1 and set_2: " + differenceSet);

        // Subset check
        boolean isSubset = set_1.containsAll(set_2);
        System.out.println("Is set_2 a subset of set_1? " + isSubset);
    }
}

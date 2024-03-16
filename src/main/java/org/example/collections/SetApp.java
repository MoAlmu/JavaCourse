package org.example.collections;

import java.util.*;

public class SetApp {

    public static void main(String[] args) {

        // initial capacity = 16
        Set<String> set1 = new HashSet<>();

        set1.add("ADAM");
        // this element will be ignored
        set1.add("ADAM");
        set1.add("Laura");
        set1.add("Ayla");
        set1.add("Mo");
        for (String a: set1) {
            System.out.println(a);
        }

        // LinkedHashSet maintains hte insertion order
        // doubly linked list connecting the items
        // It needs more memory than hashSet
        Set<String> set2 = new LinkedHashSet<>();

        set2.add("ADAM");
        // this element will be ignored
        set2.add("ADAM");
        set2.add("Laura");
        set2.add("Ayla");
        set2.add("Mo");
        for (String a: set2) {
            System.out.println(a);
        }

        SortedSet<Integer> set3 = new TreeSet<>();

        set3.add(1);
        set3.add(12);
        set3.add(13);
        set3.add(14);

        // 0 < num > 13
        Set<Integer> subSet = set3.subSet(0,13);

        // num > 10
        Set<Integer> subSe2 = set3.tailSet(10);
        // num < 10
        Set<Integer> subSe3 = set3.headSet(10);

        for(Integer num: subSet)
            System.out.println(num);

        for(Integer num: subSe2)
            System.out.println(num);
    }
}

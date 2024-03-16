package org.example.collections;

import java.util.*;

public class ListApp {

    public static void main(String[] args) {

        // resizing the array takes O(NO)
        long now = System.currentTimeMillis();
        List list1 = new ArrayList<>();
        for (int i= 0; i< 50000 ; i++) {
            list1.add(0,i);
        }

        System.out.println("Taken time for Arraylist " + (System.currentTimeMillis()  - now));

        now = System.currentTimeMillis();
        List list2 = new LinkedList<>();
        for (int i= 0; i< 50000 ; i++) {
            list2.add(i);
        }

        System.out.println("Taken time for LinkedList " + (System.currentTimeMillis()  - now));
    }
}

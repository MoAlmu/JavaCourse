package org.example.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4);
        List<String> nums2 = Arrays.asList("3","t");
        print(nums);
        print(nums2);

        // we can read items, but we can not add a nre item
        List<? extends Number> l1 = new ArrayList<>();

        // we use upper bounded wildcards to read items
        showAll(Arrays.asList(1,2,3,4));

        // we use lower Bounded wildcard. Because Number and Object are super cals of Integer
        List<? super Integer> lw1 = new ArrayList<Integer>();
        List<? super Integer> lw2 = new ArrayList<Number>();
        List<? super Integer> lw3 = new ArrayList<Object>();

        // the both in one mthode

        List<String> list = Arrays.asList("Adam","Ana","Kevin");
        List<String> list2 = new ArrayList<>();
        copy(list, list2);
        System.out.println(list2);
    }

    public static void showAll(List<? extends Number> list) {
        for (Number n: list)
            System.out.println(n);
    }

    // we are using upper bounded wildcard for the source and lower bounded wildcard for the des.
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (int i = 0; i< source.size(); i++) {
            destination.add(source.get(i));
        }
    }
}

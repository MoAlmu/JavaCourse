package org.example.typeInfernece;

import java.util.ArrayList;
import java.util.List;

public class App {

    static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }
    public static void main(String[] args) {
        // because of typ Inference knows java that this ArrayList is going to store Integers,
        List<Integer> list1 = add(new ArrayList<>(), 20, 20);
        System.out.println(list1);
        // because of typ Inference knows java that this ArrayList is going to store Strings,
        List<String> list2 = add(new ArrayList<>(), "ADAM", "HALLO");
        System.out.println(list2);
    }
}

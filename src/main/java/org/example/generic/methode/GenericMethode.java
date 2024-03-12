package org.example.generic.methode;

public class GenericMethode {

    public <T, V> void printItem(T t, V v) {
        System.out.println(t);
        System.out.println(v);
    }
    public <T> T shoeItem(T item ) {
        // System.out.println("The item is: " + item);
        return item;
    }

    public <T> void showItem(T[] items) {
        for (T t: items) {
            System.out.println(t);
        }
    }
}

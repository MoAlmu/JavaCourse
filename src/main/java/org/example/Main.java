package org.example;

class Hashtable<K, V> {
    private K key;
    private V value;
    public Hashtable(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Hashtable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}

public class Main {
    public static void main(String[] args) {
       Hashtable<Integer, Integer> hashtableInteger = new Hashtable<>(10, 20);
       Hashtable<Double, String> stringHashtableString = new Hashtable<>(10.1, "");

        System.out.println(hashtableInteger);
        System.out.println(stringHashtableString);

    }
}
package org.example.boundedTyps;

import java.sql.Array;

class Person implements Comparable<Person> {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.getAge());
    }
}
public class App {

    public static <T extends Comparable<T>> T calculattMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0) {
            return num1;
        } else {
            return num2;
        }
    }

    public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
        int counter = 0;

        for (T t : items)
            if (t.compareTo(item) > 0)
                ++counter;

        return counter;
    }

    public static <T extends Number> double add(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }
    public static void main(String[] args) {

        System.out.println(calculattMin(1,24));
        System.out.println(calculattMin(new Person(28, "ADAM"), new Person(32, "LUKA")));

        // with toString()
        System.out.println(new Person(29, "Mo"));

        // add numbers
        System.out.println(add(123, 223.5));

        // countGreaterItems
        System.out.println(countGreaterItems(new Integer[]{10, 20, 30, 40, 50}, 3));
    }
}

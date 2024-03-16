package org.example.collections;

import java.util.*;

public class SortingApp {

    public static void main(String[] args) {
        // QuickSort - to sort primitive types
        // MergeSort - to sort reference types (Integer, String)
        int[] nums = {1,3,-1,6,33,6,234,6,234};
        Arrays.sort(nums);
        // System.out.println(nums);

        // Sorting of collections

        List<String> myList = new ArrayList<>();
        myList.add("ADAM");
        myList.add("MO");
        myList.add("ABDUL");

        Collections.sort(myList);
        // REVERSE
        Collections.sort(myList, Collections.reverseOrder());

        // How to sort custom object
        List<Book> books = new ArrayList<>();
        books.add(new Book("Back Camus", "Title 1", 59));
        books.add(new Book("Peter ", "Title 2", 11));
        books.add(new Book("Adam ", "Title 2", 1123));
        books.add(new Book("Camus", "Title 3" , 231));
        // sorting by authorName
        Collections.sort(books);

        for (Book b: books) {
            System.out.println(b);
        }

        // with the interface Comperator
        Collections.sort(books, new BookComperator());

        for (Book b: books) {
            System.out.println(b);
        }

        // Lambda
        // when the Author name is the same java will sort the books according the number of Pages
        Collections.sort(books, Comparator.comparing(Book::getAuthorName).thenComparing(Book::getNumOfPages));
        books.forEach( book -> System.out.println(book.getAuthorName()));

    }
}

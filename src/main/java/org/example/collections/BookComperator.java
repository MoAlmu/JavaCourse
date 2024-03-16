package org.example.collections;

import java.util.Comparator;

public class BookComperator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getNumOfPages(), b2.getNumOfPages());
    }
}

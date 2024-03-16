package org.example.collections;

public class Book implements Comparable<Book>{

    private String authorName;
    private String title;
    private int numOfPages;

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public Book() {

    }

    public Book(String authorName, String title, int numOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
        "authorName='" + authorName + '\'' +
        ", title='" + title + '\'' +
        ", numOfPages=" + numOfPages +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        return this.authorName.compareTo(o.getAuthorName());
    }
}

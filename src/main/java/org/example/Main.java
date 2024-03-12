package org.example;

class Store <T> {
    private T item;
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

public class Main {

    public static void main(String[] args) {
        Store<String> store = new Store<>();
        store.setItem("Hallo");

        String item = store.getItem();
        System.out.println(item);
    }
}
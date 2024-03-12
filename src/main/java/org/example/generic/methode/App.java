package org.example.generic.methode;

import java.sql.Array;

public class App {

    public static void main(String[] args) {
        GenericMethode methode = new GenericMethode();

        System.out.println(methode.shoeItem(123));

        methode.printItem("1234", 123);

        methode.showItem(new Integer[] {1, 2, 3});
        methode.showItem(new String[] {"Hallo", "From", "here"});
    }
}

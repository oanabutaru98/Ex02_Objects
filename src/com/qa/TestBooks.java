package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title1", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book[] bookArray = new Book[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for (int i=0; i<bookArray.length; i++) {
            System.out.println(bookArray[i]);
        }
    }
}

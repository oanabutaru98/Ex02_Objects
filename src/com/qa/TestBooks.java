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

        Car c1 = new Car("Ferrari", "red", 2021, 200);
        Car c2 = new Car("Mercedes", "grey", 2021, 250);

        System.out.println(c1);
        System.out.println(c2);

        c1.accelerate(50);
        System.out.println(c1);

        c2.setColor("black");
        System.out.println(c2);
    }
}

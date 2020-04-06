package oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(300));
        books.add(new Book(400));
        books.add(new Book(500));

        Book b = new Book(400);
        System.out.println(b);
        System.out.println(books.contains(b));
    }
}

package com.deloitte.lab4.ex3;

public class Book extends WrittenItem {
    public Book(String id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public String toString() {
        return "Book: " + super.toString();
    }
}

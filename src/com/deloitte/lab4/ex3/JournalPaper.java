package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Journal Paper: " + super.toString() + ", Year Published: " + yearPublished;
    }
}

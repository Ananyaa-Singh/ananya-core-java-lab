package com.deloitte.lab4.ex3;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("B001", "Effective Java", 3, "Joshua Bloch");
        JournalPaper journal = new JournalPaper("J001", "Design Patterns", 2, "Gamma et al.", 1994);

        book.print();
        journal.print();

        book.checkOut();
        System.out.println("After checking out a copy:");
        book.print();

        book.checkIn();
        System.out.println("After checking in a copy:");
        book.print();
    }
}

//Output -
//Book: Item ID: B001, Title: Effective Java, Copies: 3, Author: Joshua Bloch
//Journal Paper: Item ID: J001, Title: Design Patterns, Copies: 2, Author: Gamma et al., Year Published: 1994
//After checking out a copy:
//Book: Item ID: B001, Title: Effective Java, Copies: 2, Author: Joshua Bloch
//After checking in a copy:
//Book: Item ID: B001, Title: Effective Java, Copies: 3, Author: Joshua Bloch

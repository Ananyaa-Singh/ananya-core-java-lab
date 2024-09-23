package com.deloitte.lab4.ex4;

public class VideoTest {
    public static void main(String[] args) {
        // Create a Video instance
        Video video = new Video("V001", "Inception", 5, 148, "Christopher Nolan");

        // Print the video details
        video.print();  // Using the print method from Item class

        // Demonstrate checkOut and checkIn
        System.out.println("Checking out a copy...");
        video.checkOut();
        video.print();

        System.out.println("Checking in a copy...");
        video.checkIn();
        video.print();

        // Adding more copies
        System.out.println("Adding 3 copies...");
        video.addItem(3);
        video.print();
    }
}

// Output - 
//Video: Item ID: V001, Title: Inception, Copies: 5, Runtime: 148 minutes, Director: Christopher Nolan
//Checking out a copy...
//Video: Item ID: V001, Title: Inception, Copies: 4, Runtime: 148 minutes, Director: Christopher Nolan
//Checking in a copy...
//Video: Item ID: V001, Title: Inception, Copies: 5, Runtime: 148 minutes, Director: Christopher Nolan
//Adding 3 copies...
//Video: Item ID: V001, Title: Inception, Copies: 8, Runtime: 148 minutes, Director: Christopher Nolan

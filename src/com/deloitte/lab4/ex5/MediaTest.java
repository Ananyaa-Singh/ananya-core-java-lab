package com.deloitte.lab4.ex5;

public class MediaTest {
    public static void main(String[] args) {
        // Create a Video instance
        Video video = new Video("V001", "Inception", 5, 148, "Christopher Nolan", "Sci-Fi", 2010);
        
        // Create a CD instance
        CD cd = new CD("CD001", "Abbey Road", 10, 47, "The Beatles", "Rock");

        // Print details
        video.print();
        cd.print();

        // Demonstrate checkOut and checkIn for Video
        System.out.println("Checking out the video...");
        video.checkOut();
        video.print();

        // Demonstrate adding items for CD
        System.out.println("Adding 2 more CDs...");
        cd.addItem(2);
        cd.print();
    }
}

//Output-
//Video: Item ID: V001, Title: Inception, Copies: 5, Runtime: 148 minutes, Director: Christopher Nolan, Genre: Sci-Fi, Year Released: 2010
//CD: Item ID: CD001, Title: Abbey Road, Copies: 10, Runtime: 47 minutes, Artist: The Beatles, Genre: Rock
//Checking out the video...
//Video: Item ID: V001, Title: Inception, Copies: 4, Runtime: 148 minutes, Director: Christopher Nolan, Genre: Sci-Fi, Year Released: 2010
//Adding 2 more CDs...
//CD: Item ID: CD001, Title: Abbey Road, Copies: 12, Runtime: 47 minutes, Artist: The Beatles, Genre: Rock

package com.deloitte.lab4.ex5;

import com.deloitte.lab4.ex4.MediaItem;

public class CD extends MediaItem {
    private String artist; // Artist of the CD
    private String genre;  // Genre of the CD

    public CD(String id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    // Getters
    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "CD: " + super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }
}

package com.deloitte.lab4.ex5;

import com.deloitte.lab4.ex4.MediaItem;

public class Video extends MediaItem {
    private String director;  // Director of the video
    private String genre;     // Genre of the video
    private int yearReleased; // Year the video was released

    public Video(String id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    // Getters
    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Video: " + super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }
}

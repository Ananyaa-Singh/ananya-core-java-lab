package com.deloitte.lab4.ex4;

public class Video extends MediaItem {
    private String director;  // Director of the video

    public Video(String id, String title, int numberOfCopies, int runtime, String director) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Video: " + super.toString() + ", Director: " + director;
    }
}

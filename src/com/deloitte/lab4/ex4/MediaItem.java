package com.deloitte.lab4.ex4;

import com.deloitte.lab4.ex3.Item;

public abstract class MediaItem extends Item {
    private int runtime;  // Runtime in minutes

    // Constructor
    public MediaItem(String id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    // Getter for runtime
    public int getRuntime() {
        return runtime;
    }

    // Setter for runtime
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    // toString method to include runtime information
    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }
}

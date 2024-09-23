package com.deloitte.lab4.ex3;

public abstract class Item {
    private String id;                 // Unique identification number
    private String title;              // Title of the item
    private int numberOfCopies;        // Number of copies available

    // Constructor
    public Item(String id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    // Setter for number of copies
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Add items to the collection
    public void addItem(int count) {
        if (count > 0) {
            numberOfCopies += count;
        } else {
            System.out.println("Count must be positive.");
        }
    }

    // Equals method to compare items
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item item = (Item) obj;
        return id.equals(item.id);
    }

    // toString method to display item information
    @Override
    public String toString() {
        return "Item ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    // Print method to print item information
    public void print() {
        System.out.println(this.toString());
    }

    // Method to check in an item (increase copies)
    public void checkIn() {
        numberOfCopies++;
    }

    // Method to check out an item (decrease copies)
    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        } else {
            System.out.println("No copies available for checkout.");
        }
    }
}

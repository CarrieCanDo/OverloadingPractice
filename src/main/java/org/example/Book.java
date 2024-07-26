package org.example;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    // Constructor with all parameters
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // Overloaded constructor with only title
    public Book(String title) {
        this(title, 0, 0);
    }

    // Overloaded constructor with no parameters
    public Book() {
        this("Unknown", 0, 0);
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}

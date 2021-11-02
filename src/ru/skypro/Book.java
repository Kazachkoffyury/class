package ru.skypro;

public class Book {
    private final String name;
    private int yearPublishing;
    private final String authorName;

    public Book(String name, int yearPublishing, String authorName) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.authorName = authorName;

    }

    public String getName() {
        return this.name;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;

    }


}



package ru.skypro;

public class Book {
    private final String name;
    private int yearPublishing;
    private final Author author;

    public Book(String name, int yearPublishing, Author author ) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.author= author;


    }

    public Author getAuthor () {
        return author;
    }



    public String getName() {
        return this.name;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;

    }


}



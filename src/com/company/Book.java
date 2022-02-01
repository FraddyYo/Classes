package com.company;

public class Book {
    private String name;
    private int yearOfPublication;
    private Author author;


    public Book(String name, int yearOfPublication, Author author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;

    }

    public Book() {
        String name;

    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String мертвые_души, int yearOfPublication, String gogol) {
    }


    public String getName() {
        return this.name;

    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

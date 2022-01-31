package com.company;

public class Book {
    String name;
    private int yearOfPublication;


    public Book(String name, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public Book() {
        String name;

    }

    public Book(String name) {
        this.name = name;
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

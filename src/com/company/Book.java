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


    public String toString() {
        return "Книга " + this.name + " Год публикации " + this.yearOfPublication + " Автор ";

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

package com.company;

import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublication;
    private String author;


    public Book(String name, int yearOfPublication, String author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;


    }


    public String toString() {
        return "Книга " + this.name + " Год публикации " + this.yearOfPublication + " Автор " + this.author;

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);


    }

    public int hashCode() {
        return Objects.hash(name, author);
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

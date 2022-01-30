package com.company;

public class Book {
    private String name;
    private int yearOfPublication;

    public Book(String name, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;

    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}

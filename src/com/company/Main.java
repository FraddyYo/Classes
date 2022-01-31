package com.company;

public class Main {




    public static void main(String[] args) {

        Book nameBook = new Book("Мертвые души", 1842);
        System.out.println("nameBook.name = " + nameBook.getName());
        System.out.println("nameBook.yearOfPublication = " + nameBook.getYearOfPublication());
        Author nameAuthor = new Author("Николай Васильевич Гоголь");
        Author newAuthor2 = new Author("Лев Николаевич Толстой");
        System.out.println("nameAuthor.name = " + nameAuthor.getName());
        nameBook.setYearOfPublication(1852);
        System.out.println("nameBook.getYearOfPublication() = " + nameBook.getYearOfPublication());
        Book newBook2 = new Book("Война и мир", 1867);
        Book author= new Book("Николай Васильевич Гоголь");
        System.out.println("author.name = " + author.getName());
        Book authorNew = new Book("Лев Николаевич Толстой");
        System.out.println("authorNew.name = " + authorNew.getName());


    }
}

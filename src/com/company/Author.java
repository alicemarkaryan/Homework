package com.company;

public class Author {
    private int bookCount;
    private String name;
    private int age;
    private Book [] books;


    Author(int bookCount, String name, int age, Book [] books) {
        setBookCount(bookCount);
        this.name = name;
        this.age = age;
        this.books=books;


    }

    public void setBookCount(int bookCount) {
        if (bookCount > 0) {
            this.bookCount = bookCount;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBooks(Book[] books) {

                this.books = books;
    }
    public int getBookCount(){
        return bookCount;
    }


  public  Book getBook(String name) {

      for (int i = 0; i < books.length; i++) {
          if (books[i].getBookName().equals(name)) {

                 return books[i];
          }

      }


   return null;
  }



}
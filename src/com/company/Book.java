package com.company;

public class Book {
    private String genre;
    private int pageCount;
    private String author;

    private String bookName;

    Book(String bookName,String genre, int pageCount, String author) {
        this.bookName=bookName;
        this.genre = genre;
        setPageCount(pageCount);
        this.author = author;

    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }



    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        }
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String print(){
        return "bookName- "+bookName+": genre- "+genre+": pageCount- "+pageCount+": author- "+author;

    }
    public static void main(String[] args){
        Book b1=new Book("Da Vinci code","Crime", 800,"Brown Dan");
        Book b2=new Book("Harry Potter","Children's fiction",2000,"Rowling");
        Book b3=new Book("One day","general", 350,"Nicholls David");
        Book b4=new Book("Digital fortress","general",700, "Brown Dan");
        Book b5=new Book("Silkworm","fantasy",520,"Rowling");
        Book b6=new Book("Lethal White","fantasy",820,"Rowling");
        Book b7=new Book("Medieval West","general", 951,"Nicholls David");
        Author a1=new Author("Brown Dan", 56, new Book[]{b1,b4});
        Author a2=new Author("Rowling",55, new Book[]{b2,b5,b6});
        Author a3=new Author("Nicholls David",78,new Book []{b3,b7});



        String d="Da Vinci code";
        if( a1.getBook(d)==null){
            System.out.println(d+" book doesn't found");
        }else {
            System.out.println(a1.getBook(d).print());
        }






    }
}
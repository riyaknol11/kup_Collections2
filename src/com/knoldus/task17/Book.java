package com.knoldus.task17;

//class Book with fields title, author, and price
public class Book
{
    String title;
    String author;
    Double price;

    Book(String title, String author, Double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", price=" + price + '}';
    }


}

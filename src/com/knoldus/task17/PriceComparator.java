package com.knoldus.task17;


import java.util.Comparator;

public class PriceComparator implements Comparator<Book>
{

    //sorting the book objects by price in descending order.
    @Override
    public int compare(Book bookA, Book bookB) {
        return (int) (bookB.price - bookA.price);
    }
}

package com.knoldus.task17;

import java.util.Comparator;

//sorting Book objects by author in alphabetical order
public class AuthorComparator implements Comparator<Book>
{
    @Override
    public int compare(Book bookA, Book bookB) {
        return bookA.author.compareTo(bookB.author);
    }
}




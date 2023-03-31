package com.knoldus.task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainBookList
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        System.out.println("Enter the number of books: ");
        Integer numberOfBooks = input.nextInt();
        String titleOfBook;
        String authorOfBook;
        Double priceOfBook;
        for(Integer index = 1; index<=numberOfBooks; index++){
            System.out.println("Enter the title for book " + index + " :");
            titleOfBook = input.nextLine();
            titleOfBook = input.nextLine();
            System.out.println("Enter the author for book "+ index + " :");
            authorOfBook = input.nextLine();
            System.out.println("Enter the price for book "+ index + " :");
            priceOfBook = input.nextDouble();
            Book book = new Book(titleOfBook, authorOfBook, priceOfBook);
            bookList.add(book);
        }

        System.out.println("Sorting the list by title :");
        Collections.sort(bookList, new AuthorComparator());

        System.out.println(bookList);

        System.out.println("Sorting the list by price :");
        Collections.sort(bookList, new PriceComparator());

        System.out.println(bookList);
    }
}

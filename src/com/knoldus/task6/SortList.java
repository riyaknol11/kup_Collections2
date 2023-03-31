package com.knoldus.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the ArrayList: ");
        int size = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = input.nextInt();
            list.add(element);
        }

        Collections.sort(list);
        for (Integer sortedList: list) {
            System.out.println("Sorted list is : " + sortedList);
        }

    }
}

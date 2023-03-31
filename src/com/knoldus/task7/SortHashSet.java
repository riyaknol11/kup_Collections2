package com.knoldus.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SortHashSet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the HashSet:");
        int size = input.nextInt();
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter " + size + " strings inputs in hashset:");
        for (int i = 0; i < size; i++) {
            String text = input.next();
            set.add(text);
        }

        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("List in descending order : " + list);

    }
}

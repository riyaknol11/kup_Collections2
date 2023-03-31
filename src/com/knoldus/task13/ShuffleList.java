package com.knoldus.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        System.out.println("Enter the integer values for the list:");
        for (int i = 0; i < size; i++) {
            int value = input.nextInt();
            list.add(value);
        }

        System.out.println("List before shuffling: " + list);
       Collections.shuffle(list);
        System.out.println("List after shuffling :" + list);
    }
}

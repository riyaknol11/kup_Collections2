package com.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        //sorting string list in ascending order
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList :");
        int size = input.nextInt();
        System.out.println("Enter the names to be sorted in ascending order : ");
        for(int i=0; i<size;i++){
           String input_names = input.next();
            list.add(input_names);
        }

        Collections.sort(list);
        System.out.println("List of names in ascending order is : " + list);
    }
}

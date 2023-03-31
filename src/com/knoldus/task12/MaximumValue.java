package com.knoldus.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumValue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(15);
        list.add(20);
        list.add(5);
        list.add(60);

        Integer maximum = Collections.max(list);
        System.out.println("Maximum number in the list is " + maximum);
    }
}

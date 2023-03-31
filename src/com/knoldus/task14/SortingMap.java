package com.knoldus.task14;

import java.util.*;

public class SortingMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Item1", 500);
        map.put("Item2", 600);
        map.put("Item3", 700);
        map.put("Item4", 800);

        ArrayList<Integer> list = new ArrayList<>();

        //Loop to put the values of map in list.
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        // Sorting the ArrayList in descending order using a custom Comparator
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer next) {
                return next.compareTo(integer);
            }
        });
        System.out.println(list);

        // Creating a new LinkedHashMap to store the sorted entries from the original map
        LinkedHashMap<String, Integer> decendingSort = new LinkedHashMap<>();

        for(Integer list1 : list){
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue().equals(list1))
                decendingSort.put(entry.getKey(), list1);
            }
        }
        System.out.println("LinkedHashMap with the entries sorted in descending order by their values :" + decendingSort);




    }
}

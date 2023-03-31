package com.knoldus.task8;

import java.util.*;

public class SortingTreeMap {
    public static void main(String[] args) {
        Map<String , Integer> map = new TreeMap<String , Integer>();
        map.put("Riya", 50);
        map.put("Nadra", 20);
        map.put("Jasleen" , 60);
        map.put("Anshika", 100);
        map.put("Sahil", 5);

        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>();

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            list.add(entry);
        }

        //// Sorting the list in descending order of values using a comparator

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> nextStringIntegerEntry) {

                return nextStringIntegerEntry.getValue().compareTo(stringIntegerEntry.getValue());
            }
        });

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

     // Loop to put the entries of the sorted list in the LinkedHashMap
        for(Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());

        }
        System.out.println(sortedMap);

    }
}

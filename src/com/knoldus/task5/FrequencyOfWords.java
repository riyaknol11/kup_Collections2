package com.knoldus.task5;

import java.util.*;
public class FrequencyOfWords {

    //function to find the top 10 most frequent words.
    public static void countingFrequency(String[] wordCount){
        HashMap<String, Integer> map = new HashMap<>();
        //loop to find the frequency of each word in the given sentence
     for(int i=0; i<wordCount.length;i++){
         if(map.containsKey(wordCount[i])){
             map.put(wordCount[i], map.get(wordCount[i]) + 1);
         }
         else{
             map.put(wordCount[i], 1);
         }
     }
        System.out.println("Frequency of each word in the given sentence"  + map);

     //map conversion to list
     List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

     //sorting the list using comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> object1, Map.Entry<String, Integer> object2) {
                return object2.getValue().compareTo(object1.getValue());
            }
        });

        System.out.println("Sorted list in descending order is : " + list);

        //Printing the top 10 words with highest occurrence
        System.out.println("Top 10 most frequent words in the given phrase is : ");
        for(int i=0; i<10; i++){
            Map.Entry<String,Integer> entry = list.get(i);
//            System.out.println(entry);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        //words as keys and frequency as values

        String sentence = "Maybe you crack all the time among your friends. So knock knock is actually the first liner of a joke. Okay, there are too many knock knock jokes that you will find online and the other way that you can use knock knock is when you want to ask someone to get aside or you want someone to hear you out. ";
        String[] wordCount = sentence.split(" ");
        FrequencyOfWords.countingFrequency(wordCount);

    }
}

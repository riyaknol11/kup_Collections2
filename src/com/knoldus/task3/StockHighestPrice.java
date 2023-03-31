package com.knoldus.task3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockHighestPrice {
    public static void highestPrice(HashMap<String,Double> map){
        Double maxPrice = Collections.max(map.values());
        System.out.println(maxPrice);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if(entry.getValue() == maxPrice){
                System.out.println("Stock symbol " + entry.getKey() + " has the highest price of " + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the map : ");
        Integer size = input.nextInt();
        //stock-symbols in string and price in double
        System.out.println("Enter the stock symbols and their values :");
        for(int i=0; i<size; i++){

            String symbols = input.next();
            Double price = input.nextDouble();
            map.put(symbols,price);
        }
        System.out.println("Map of stock-symbol as the key and price as the value is : " + map);
        highestPrice(map);

    }
}

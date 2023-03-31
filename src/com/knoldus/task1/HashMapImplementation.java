package com.knoldus.task1;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapImplementation{
    public static void main(String[] args) {

        System.out.println("Enter the number of entries for which you want to store name and age: ");
        Scanner input =new Scanner(System.in);
        Integer number = input.nextInt();

        //creating hashmap of type string(key) and integer(value)
        HashMap<String,Integer> personDetails=new HashMap<>();
        for (Integer count = 1; count<=number ; count++){
            System.out.println("Enter the name of person "+ count + ":");
            String name= input.next();
            System.out.println("Enter the age of the person "+ count + ":");
            Integer age = input.nextInt();

            // adding name and age of each person into Hashmap.
            personDetails.put(name,age);

        }
        System.out.println("Name and Age of all the persons: ");

        // printing personDetails.
        for(String name:personDetails.keySet()){
            System.out.println("Name: "+name + "," + " Age: "+personDetails.get(name));
        }

    }
}
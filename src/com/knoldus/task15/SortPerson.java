package com.knoldus.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortPerson
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        System.out.println("Enter the number of persons: ");
        Integer totalPerson = input.nextInt();
        String personName;
        Integer personAge;
        for(Integer index = 0; index<totalPerson; index++){
            System.out.println("Enter the name of "+ index + ":");
            personName = input.nextLine();
            personName = input.nextLine();
            System.out.println("Enter the age of "+ index + ":");
            personAge = input.nextInt();
            Person person = new Person(personName, personAge);
            personList.add(person);
        }

        Collections.sort(personList, new AgeComparator());
        System.out.println(personList);

    }

}

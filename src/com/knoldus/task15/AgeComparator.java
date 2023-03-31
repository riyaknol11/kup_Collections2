package com.knoldus.task15;


import java.util.Comparator;

public class AgeComparator implements Comparator<Person>
{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.age-person2.age;
    }
}
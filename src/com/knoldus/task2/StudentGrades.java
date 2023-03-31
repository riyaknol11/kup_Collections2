package com.knoldus.task2;

import java.util.ArrayList;
import java.util.List;

public class StudentGrades
{
    ArrayList<Integer> grades;
    StudentGrades(ArrayList<Integer> grades)
    {
        this.grades=grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}

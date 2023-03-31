package com.knoldus.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageGrade
{
    //// Function to calculate average grade for each student
    public static void calculateAverageGrade(HashMap<String, StudentGrades> nameAndGradeMap) {
        for (Map.Entry<String, StudentGrades> entry : nameAndGradeMap.entrySet()) {
            List<Integer> gradesPerStudent = entry.getValue().getGrades();
            //using stream functions to calculate average
            System.out.println(entry.getKey() + "'s average grade is: " + gradesPerStudent.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage());
        }
    }

    public static void main(String[] args)
    {
        //entering grades for all students
        StudentGrades student1Grades = new StudentGrades(new ArrayList<Integer>() {{
            add(5);
            add(6);
            add(5);
        }});
        StudentGrades student2Grades = new StudentGrades(new ArrayList<Integer>() {{
            add(5);
            add(6);
            add(5);
        }});
        StudentGrades student3Grades = new StudentGrades(new ArrayList<Integer>() {{
            add(3);
            add(3);
            add(5);
        }});
        StudentGrades student4Grades = new StudentGrades(new ArrayList<Integer>() {{
            add(5);
            add(4);
            add(5);
        }});
        StudentGrades student5Grades = new StudentGrades(new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(5);
        }});
        HashMap<String, StudentGrades> studentNameAndGrades = new HashMap<>();
        studentNameAndGrades.put("Riya", student1Grades);
        studentNameAndGrades.put("Jasleen", student2Grades);
        studentNameAndGrades.put("Rahul", student3Grades);
        studentNameAndGrades.put("Sahil", student4Grades);
        studentNameAndGrades.put("Salil", student5Grades);
        AverageGrade.calculateAverageGrade(studentNameAndGrades);
    }
}

package com.knoldus.task4;
import java.util.HashMap;
import java.util.Map;

public class SalaryModification{

    public static void main(String[] args) {

        // Create a HashMap with employee names as keys and their salaries as values
        Map<String, Double> employeeSalaries = new HashMap<>();
        employeeSalaries.put("Riya", 50000.0);
        employeeSalaries.put("Jasleen", 45000.0);
        employeeSalaries.put("Sahil", 60000.0);
        employeeSalaries.put("Salil", 48000.0);
        employeeSalaries.put("Anshika", 52000.0);

        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            if (entry.getValue() < 50000.0) {
                double newSalary = entry.getValue() * 1.05;
                employeeSalaries.put(entry.getKey(), newSalary);
            }
        }
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            System.out.println("Incremented salary of : " + entry.getKey()  + "is :" + entry.getValue());
        }
    }
}

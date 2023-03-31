package com.knoldus.task16;

// class Employee with fields name, id, and salary
public class Employee implements Comparable<Employee>
{
    String name;
    Integer id;
    Double salary;

    Employee(String name, Integer id, Double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.id-employee.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

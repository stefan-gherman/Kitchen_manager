package com.codecool.kitchen.workers;

import java.util.Date;

public class Employee {

    //Fields
    private String name;
    private Date birthYear;
    private float salary;

    //Constructor
    public Employee(String name, Date birthYear, float salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", salary=" + salary;
    }
}

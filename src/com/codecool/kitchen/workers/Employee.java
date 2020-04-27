package com.codecool.kitchen.workers;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

public abstract class Employee implements Behaviour{

    private String name;
    private Date birthYear;
    private float salary;
    private final float TAX_DEDUCTION = 0.99f;
    private boolean hasKnives;


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


    public abstract void cook();
    public abstract void cook(List<KitchenHelper> kitchenHelpers);
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", salary=" + salary;
    }


    @Override
    public void printTax() {
        System.out.println(this.salary - (TAX_DEDUCTION * this.salary));
    }


}

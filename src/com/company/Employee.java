package com.company;

import java.util.Random;

public class Employee {
    long id;
    String name;
    int age;
    double salary;
    String gender;

    public Employee(){

    }

    public Employee(long id, String name, int age, double salary, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public double calculateSalaryAndBonus(){
        return salary;
    }

    void print(){
        System.out.println("id " + id + ", name " + name +", age " + age +
                ", salary " + salary + ", gender " + gender);
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}

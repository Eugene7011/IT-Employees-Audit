package com.company;

import java.util.Random;

public class Designer extends Employee{
    double rate;
    int workedDays;

    public Designer(long id, String name, int age, double salary, String gender, double rate, int workedDays){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public double calculateSalaryAndBonus(){
        Random random = new Random();
        return (salary + rate * workedDays);
    }

    void print(){

        System.out.println("id " + id + ", name " + name +", age " + age +
                ", salary " + salary + ", gender " + gender + ", rate "+ rate + ", workedDays" + workedDays);
    }
}

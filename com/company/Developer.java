package com.company;

import java.util.Random;

public class Developer extends Employee{
    int fixedBugs;

    public Developer(long id, String name, int age, double salary, String gender, int fixedBugs){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
    }

    public Developer() {

    }

    public double calculateSalaryAndBonus(){
        Random random = new Random();
        return (salary + fixedBugs*(random.nextBoolean() ? 2:0));
    }

    void print(){

        System.out.println("id " + id + ", name " + name +", age " + age +
                ", salary " + salary + ", gender " + gender + ", fixedBugs "+ fixedBugs);
    }

}

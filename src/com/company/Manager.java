package com.company;

public class Manager extends Employee{


    public Manager(){

    }

    public Manager(long id, String name, int age, double salary, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }



    @Override
    public String toString(){
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }

}

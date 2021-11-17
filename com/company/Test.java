package com.company;

public class Test {
    public static void main(String[] args) {

        Manager maxym = new Manager(3, "Maxym", 34, 100_000.00, "Male");
        Manager ira = new Manager (4, "Ira", 25, 20_000.00, "Female");

        Developer tolik = new Developer(5, "Tolik", 32, 500_000.00,"Male", 98);
        Developer alex = new Developer(6, "Alex", 35, 500_000.00,"Male", 57);

        Designer masha = new Designer(7, "Masha", 24, 150_000.00, "Female", 17, 21);
        Designer kristina = new Designer(8, "Kristina", 29, 150_000.00, "Female", 18, 20);
        Designer alexandr = new Designer(8, "Alex", 22, 130_000.00, "Male", 18, 20);

        Employee[] employees = {maxym, ira, tolik, alex, masha, kristina, alexandr};

        EmployeeService employeeService = new EmployeeService(employees);

        employeeService.printEmployees();

        System.out.println("===============Salary=====================");
        System.out.println("Total Salary of all employees is " + employeeService.calculateSalaryAndBonus());

        System.out.println("================getById====================");
        (employeeService.getById(6)).print();

        System.out.println("================getByName====================");
        (employeeService.getByName("Tolik")).print();

        System.out.println("================sortByName====================");
        employeeService.sortByName(employees);
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }

        System.out.println("================sortByNameAndSalary====================");
        employeeService.sortByNameAndSalary(employees);
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }

        System.out.println("===================edit======================");
        Designer editEmployee = new Designer(7, "Vova", 21, 12_000.00, "Male", 12, 25);
        (employeeService.edit(editEmployee)).print();

        System.out.println("==================remove=====================");
        Employee removedEmployee = employeeService.remove(6);

        System.out.println("===================add======================");
        Designer newDesigner = new Designer(9, "Vasya", 100, 12_000.00, "Male", 11, 28);
        employeeService.add(newDesigner);

        System.out.println("=============generateEmployees===============");
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeFactory.generateEmployees(7);
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }

    }
}

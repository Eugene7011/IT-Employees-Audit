package com.company;

public class Test {
    public static void main(String[] args) {
        Employee Anton = new Employee(1, "Anton", 45, 250_000.00, "Male");
        Employee Zhora = new Employee(2, "Zhora", 19, 50_000.00, "Male");

        Manager Maxym = new Manager(3, "Maxym", 34, 100_000.00, "Male");
        Manager Ira = new Manager (4, "Ira", 25, 20_000.00, "Female");

        Developer Tolik = new Developer(5, "Tolik", 32, 500_000.00,"Male", 98);
        Developer Alex = new Developer(6, "Alex", 35, 500_000.00,"Male", 57);

        Designer Masha = new Designer(7, "Masha", 24, 150_000.00, "Female", 17, 21);
        Designer Kristina = new Designer(8, "Kristina", 29, 150_000.00, "Female", 18, 20);

        Employee[] employees = {Anton, Zhora};
        Manager[] managers = {Maxym, Ira};
        Developer[] developers = {Tolik, Alex};
        Designer[] designers = {Masha, Kristina};

        EmployeeService employeeService = new EmployeeService(employees, managers, developers, designers);

        employeeService.printEmployees();

        System.out.println("===============Salary=====================");
        System.out.println("Total Salary of all employees is " + employeeService.calculateSalaryAndBonus());

        System.out.println("================getById====================");
        System.out.println(employeeService.getById(3));

        System.out.println("================getByName====================");
        System.out.println(employeeService.getByName("Tolik"));

        System.out.println("================sortByName====================");
        employeeService.sortByName(employees, managers, developers, designers);
//        for (int i = 0; i < employeesSortedByName.length; i++) {
//            employeesSortedByName[i].print();
//        }

    }
}

package com.company;

public class EmployeeService {
    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    void printEmployees() {

        for (Employee employee : employees) {
            employee.print();
        }

    }

    double calculateSalaryAndBonus() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.calculateSalaryAndBonus();
        }

        return sum;
    }

    public Employee getById(long id) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }

        return null;
    }

    public Employee getByName(String name) {

        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return getById(employee.id);
            }
        }

        return null;
    }

    public Employee[] sortByName(Employee[] employees) {

        boolean sorted = false;
        Employee temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                String firstEmployeeName = employees[i].name;
                String secondEmployeeName = employees[i + 1].name;

                if (firstEmployeeName.compareTo(secondEmployeeName) > 0) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return employees;
    }

    public Employee[] sortByNameAndSalary(Employee[] employees) {

        boolean sorted = false;
        Employee temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                String firstEmployeeName = employees[i].name;
                String secondEmployeeName = employees[i + 1].name;

                if (firstEmployeeName.compareTo(secondEmployeeName) > 0) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    sorted = false;
                }
                if (firstEmployeeName.equals(secondEmployeeName)) {
                    double firstEmployeeSalary = employees[i].salary;
                    double secondEmployeeSalary = employees[i + 1].salary;
                    if (firstEmployeeSalary > secondEmployeeSalary) {
                        temp = employees[i];
                        employees[i] = employees[i + 1];
                        employees[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        return employees;
    }

    public int indexOf(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == employee.id) {
                return i;
            }
        }
        return -1;
    }

    public Employee edit(Employee newEmployee) {

        Employee currentEmployee = getById(newEmployee.id);
        employees[indexOf(newEmployee)] = newEmployee;

        return currentEmployee;

//        варинт с возвратом новой версии сотудника
//        Employee currentEmployee = getById(newEmployee.id);
//
//
//        currentEmployee.id = newEmployee.id;
//        currentEmployee.name = newEmployee.name;
//        currentEmployee.age = newEmployee.age;
//        currentEmployee.salary = newEmployee.salary;
//        currentEmployee.gender = newEmployee.gender;
//
//        if(currentEmployee instanceof Developer){
//            Developer newDeveloperLink = (Developer) newEmployee;
//            Developer currentDeveloperLink = (Developer) currentEmployee;
//
//            currentDeveloperLink.fixedBugs = newDeveloperLink.fixedBugs;
//        }
//
//        if(newEmployee instanceof Designer){
//            Designer newDesignerLink = (Designer) newEmployee;
//            Designer currentDesignerLink = (Designer) currentEmployee;
//
//            currentDesignerLink.rate = newDesignerLink.rate;
//            currentDesignerLink.workedDays = newDesignerLink.workedDays;
//        }
//
//        return currentEmployee;
    }

    public Employee remove (long id){
        long removedId = id;
        Employee removedEmployee = getById(removedId);
        int removedIndex = indexOf(removedEmployee);

        Employee[] newEmployees = new Employee[employees.length - 1];

        int count = 0;
        for (int i = 0; i < removedIndex; i++) {
            newEmployees[count] = employees[i];
            count++;
        }

        for (int i = removedIndex + 1; i < employees.length; i++) {
            newEmployees[count] = employees[i];
            count++;
        }
//вывод на печать массива-1 для теста
//        for (Employee employee : newEmployees) {
//            employee.print();
//        }

        return removedEmployee;
    }

    public void add (Employee addedEmployee){
        Employee[] newEmployees = new Employee[employees.length + 1];
        newEmployees[newEmployees.length - 1] = addedEmployee;
//тест на печать - не работает почему - то
//        for (Employee employee : newEmployees) {
//            employee.print();
//        }
    }
}
package com.company;

public class EmployeeService {
    Employee[] employees;
    Manager[] managers;
    Developer[] developers;
    Designer[] designers;

    public EmployeeService(Employee[] employees, Manager[] managers, Developer[] developers, Designer[] designers){
        this.employees = employees;
        this.managers = managers;
        this.developers = developers;
        this.designers = designers;
    }
    //

    void printEmployees(){

            for (Employee employee : employees) {
            employee.print();
            }

            for (Manager manager : managers) {
            manager.print();
            }

            for (Developer developer : developers) {
            developer.print();
            }

            for (Designer designer : designers) {
            designer.print();
            }

    }

    double calculateSalaryAndBonus(){
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.calculateSalaryAndBonus();
        }

        for (Manager manager : managers) {
            sum += manager.calculateSalaryAndBonus();
        }

        for (Developer developer : developers) {
            sum += developer.calculateSalaryAndBonus();
        }

        for (Designer designer : designers) {
            sum += designer.calculateSalaryAndBonus();
        }
        return sum;
    }

    public Employee getById(long id){
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }

        for (Manager manager : managers) {
            if (manager.id == id) {
                return manager;
            }
        }

        for (Developer developer : developers) {
            if (developer.id == id) {
                return developer;
            }
        }

        for (Designer designer : designers) {
            if (designer.id == id) {
                return designer;
            }
        }

        return null;
    }

    public Employee getByName(String name){
        Employee temp = new Employee();
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                temp = employee;
            }
        }

        for (Manager manager : managers) {
            if (manager.name.equals(name)) {
                temp = manager;
            }
        }

        for (Developer developer : developers) {
            if (developer.name.equals(name)) {
                temp = developer;
            }
        }

        for (Designer designer : designers) {
            if (designer.name.equals(name)) {
                temp = designer;
            }
        }

        return temp;
    }

    public Employee[] sortByName(Employee[] employees, Manager[] managers, Developer[] developers, Designer[] designers){
        String[] sortedEmployees = new String[employees.length + managers.length + developers.length + designers.length];
        for (int i = 0; i < employees.length; i++) {
            sortedEmployees[i] = employees[i].name;
        }

        for (int i = employees.length; i < (employees.length + managers.length); i++) {
            sortedEmployees[i] = managers[i].name;
        }

        for (int i = (employees.length + managers.length); i < (employees.length + managers.length + developers.length); i++) {
            sortedEmployees[i] = developers[i].name;
        }

        for (int i = (employees.length + managers.length + developers.length); i < sortedEmployees.length; i++) {
            sortedEmployees[i] = designers[i].name;
        }

        for (int i = 0; i < sortedEmployees.length; i++) {
            employees[i] = getByName(sortedEmployees[i]);
        }

        boolean sorted = false;
        Employee temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                String firstEmployeeName = employees[i].name;
                String secondEmployeeName = employees[i+1].name;

                if (firstEmployeeName.compareTo(secondEmployeeName)>0) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return employees;
    }

}

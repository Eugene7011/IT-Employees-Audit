package com.company;

import sun.security.krb5.internal.crypto.Des;

import java.util.Random;

public class EmployeeFactory {

    public Employee[] generateEmployees(int size) {
        Random random = new Random();
        int managersCount = random.nextInt(size);
        int developersCount = random.nextInt(size - managersCount);
        int designersCount = random.nextInt(size - developersCount - managersCount);

        Manager[] managers = new Manager[managersCount];
        for (int i = 0; i < managersCount; i++) {
            managers[i] = getRandomManager();
        }

        Developer[] developers = new Developer[developersCount];
        for (int i = 0; i < developersCount; i++) {
            developers[i] = getRandomDeveloper();
        }

        Designer[] designers = new Designer[designersCount];
        for (int i = 0; i < designersCount; i++) {
            designers[i] = getRandomDesigner();
        }

        Employee[] generatedEmployees = new Employee[size];
        int index = 0;
        for (Manager randomManager: managers) {
            generatedEmployees[index] = randomManager;
            index++;
        }

        for (Developer randomDeveloper: developers) {
            generatedEmployees[index] = randomDeveloper;
            index++;
        }

        for (Designer randomDesigner: designers) {
            generatedEmployees[index] = randomDesigner;
            index++;
        }

        return generatedEmployees;
    }

    public Manager getRandomManager(){
        Manager randomManager = new Manager();
        Random random = new Random();
        randomManager.id = 1 + random.nextInt(1000);
        randomManager.age = 18 + random.nextInt(51);
        randomManager.salary = 1000 + random.nextInt(140001);
        if (Math.random() < 0.5) {
            randomManager.gender = "Male";
        } else {
            randomManager.gender = "Female";
        }

        String[] namesMen = {"Edward", "Tony", "James", "Anton", "Tolik",
                "Oleg", "Denis", "Stas", "Max", "Dima"};
        String[] namesWomen = {"Marina", "Natasha", "Gulya", "Sara", "Klava",
                "Anna", "Paraska", "Ira", "Valya", "Dusya"};

        if (randomManager.gender.equals("Male")){
            randomManager.name = namesMen[random.nextInt(namesMen.length)];
        }
        else{
            randomManager.name = namesWomen[random.nextInt(namesWomen.length)];
        }
        return randomManager;
    }

    public Developer getRandomDeveloper(){
        Developer randomDeveloper = new Developer();
        Random random = new Random();
        randomDeveloper.id = 1 + random.nextInt(1000);
        randomDeveloper.age = 18 + random.nextInt(51);
        randomDeveloper.salary = 1000 + random.nextInt(140001);
        if (Math.random() < 0.5) {
            randomDeveloper.gender = "Male";
        } else {
            randomDeveloper.gender = "Female";
        }

        randomDeveloper.fixedBugs = 1 + random.nextInt(500);

        String[] namesMen = {"Edward", "Tony", "James", "Anton", "Tolik",
                "Oleg", "Denis", "Stas", "Max", "Dima"};
        String[] namesWomen = {"Marina", "Natasha", "Gulya", "Sara", "Klava",
                "Anna", "Paraska", "Ira", "Valya", "Dusya"};

        if (randomDeveloper.gender.equals("Male")){
            randomDeveloper.name = namesMen[random.nextInt(namesMen.length)];
        }
        else{
            randomDeveloper.name = namesWomen[random.nextInt(namesWomen.length)];
        }
        return randomDeveloper;
    }

    public Designer getRandomDesigner(){
        Designer randomDesigner = new Designer();
        Random random = new Random();
        randomDesigner.id = 1 + random.nextInt(1000);
        randomDesigner.age = 18 + random.nextInt(51);
        randomDesigner.salary = 1000 + random.nextInt(140001);
        if (Math.random() < 0.5) {
            randomDesigner.gender = "Male";
        } else {
            randomDesigner.gender = "Female";
        }

        randomDesigner.rate = 1 + random.nextInt(29);
        randomDesigner.workedDays = random.nextInt(32);

        String[] namesMen = {"Edward", "Tony", "James", "Anton", "Tolik",
                "Oleg", "Denis", "Stas", "Max", "Dima"};
        String[] namesWomen = {"Marina", "Natasha", "Gulya", "Sara", "Klava",
                "Anna", "Paraska", "Ira", "Valya", "Dusya"};

        if (randomDesigner.gender.equals("Male")){
            randomDesigner.name = namesMen[random.nextInt(namesMen.length)];
        }
        else{
            randomDesigner.name = namesWomen[random.nextInt(namesWomen.length)];
        }
        return randomDesigner;
    }

}

package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan healthplan1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        System.out.println(healthplan1);


        String[] healthplans = new String[2];
        Employee employee1 = new Employee(1, "John Doe", "jd@test.com", "1234", healthplans);
        System.out.println(employee1);
        employee1.addHealthplan(0, "A Sigorta");
        employee1.addHealthplan(1, "B Sigorta");


        String[] developerNames = new String[3];
        Company company = new Company(1, "Workintech", 1000, developerNames);
        System.out.println(company);
        company.addEmployee(0, "Jane Doe");
        company.addEmployee(1, "Alice");


    }
}

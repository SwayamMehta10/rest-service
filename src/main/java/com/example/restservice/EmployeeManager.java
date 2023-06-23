package com.example.restservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

    private static Employees list = new Employees();
    
    static {
        list.getEmployeeList().add(
            new Employee(1, "Swayam", "Mehta", "swam10@gmail.com", "Co-Founder")
        );

        list.getEmployeeList().add(
            new Employee(2, "Shubhangi", "Tiwari", "rimjhim11@gmail.com", "Co-Founder")
        );

        list.getEmployeeList().add(
            new Employee(3, "Nikhil", "Agarwal", "niks20@gmail.com", "Co-Founder")
        );
    }
    
    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}

package com.example.fish_hatchery.suad_2521067.user.managingDirector;

import java.time.LocalDate;

public class StaffAssignment {
    private String name;
    private String role;
    private float salary;
    private LocalDate date;

    public StaffAssignment(String name, String role, float salary, LocalDate date) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StaffAssignment{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}

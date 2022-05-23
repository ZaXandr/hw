package com.task010422.task1;

public class Employee extends Person{
    private double salary;
    private String[] workDays;

    public Employee(double salary, String[] workDays) {
        this.salary = salary;
        this.workDays = workDays;
    }

    public Employee() {
    }

    public Employee(String name, int age, String email, String telephone, double salary, String[] workDays) {
        super(name, age, email, telephone);
        this.salary = salary;
        this.workDays = workDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getWorkDays() {
        return workDays;
    }

    public void setWorkDays(String[] workDays) {
        this.workDays = workDays;
    }
}

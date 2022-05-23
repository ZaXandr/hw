package com.task010422.task1;

import com.task010422.task3.Employee;

public class Doctor extends Employee {
    private String speciality;

    public Doctor(String name, String email, int experience) {
        super(name, email, experience);
    }

    public Doctor(String name, String email, int experience, String speciality) {
        super(name, email, experience);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

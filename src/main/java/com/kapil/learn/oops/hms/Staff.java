package com.kapil.learn.oops.hms;

public class Staff extends User {
    private long id;
    private int yearsOfExperience;
    private String description;
    private double salary;

    Staff() {
        System.out.println("Staff constructor 1");
    }

    Staff(int id) {
        this();
        this.id = id;
        System.out.println("Staff constructor 2");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

package com.prowesssoft.restservice;

public class Student {

    private final long id;
    private final String name;
    private final String department;
    private final String postalCode;
    private final String email;

    public Student(long id, String name, String department, String postalCode, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.postalCode = postalCode;
        this.email = email;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getEmail() {
        return email;
    }
}
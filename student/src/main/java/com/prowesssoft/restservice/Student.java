package com.prowesssoft.restservice;

public class Student {

    private final long id;
    private final String name;
    private final String department;
    private final String postal_code;
    private final String email;

    public Student(long id, String name, String department, String postal_code, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.postal_code = postal_code;
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
        return postal_code;
    }
    public String getEmail() {
        return email;
    }
}
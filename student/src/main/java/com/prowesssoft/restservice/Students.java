package com.prowesssoft.restservice;

public class Students {

    Student[] myStudent = {Student(1, "John Doe", "Computer Science", "66502", "john.doe@school.edu")};

    public Students(Student[] myStudent) {
        this.myStudent = myStudent;
    }
    public long getStudents() {
        return myStudent;
    }
}
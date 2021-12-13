package com.prowesssoft.restservice;

import java.util.ArrayList;
import java.util.List;

public class Students {
	private List<Student> students;
	public Students() {
		students = new ArrayList<>();
	}
    public List<Student> getStudents() {
    	students.add(new Student(1, "John Doe", "Computer Science", "66502", "john.doe@school.edu"));
        return students;
    }

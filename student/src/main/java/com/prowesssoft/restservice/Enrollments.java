package com.prowesssoft.restservice;

import java.util.ArrayList;
import java.util.List;

public class Enrollments {
	private List<Enrollment> enrollments;

	public Enrollments() {
		enrollments = new ArrayList<>();
	}

	public List<Enrollment> getEnrollments() {
		enrollments.add(new Enrollment(1, 1, 401, "Computer Networks"));
		enrollments.add(new Enrollment(2, 1, 407, "Distributed Systems"));
		enrollments.add(new Enrollment(3, 1, 416, "Realtime Systems"));
		return enrollments;
	}
}

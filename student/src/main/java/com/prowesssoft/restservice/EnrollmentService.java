package com.prowesssoft.restservice;

import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
	public Enrollments getEnrollments() {
		return new Enrollments();
	}

}

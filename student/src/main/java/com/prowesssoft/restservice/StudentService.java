package com.prowesssoft.restservice;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public Students getStudents() {
		return new Students();
	}

}

package com.prowesssoft.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

    @Autowired
    private EnrollmentService enrollmentService;

    public static void main(String[] args) {
        SpringApplication.run(StudentController.class, args);
    }

    @GetMapping("/students")
    public Students students() {
        return studentService.getStudents();
    }

    @GetMapping("/enrollments")
    public Enrollments enrollments() { return enrollmentService.getEnrollments();}
}

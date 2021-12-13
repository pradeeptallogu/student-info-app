package com.prowesssoft.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(StudentController.class, args);
    }

    @GetMapping("/students")
    public Students students() {
        return studentService.getStudents();
    }
}

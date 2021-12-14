package com.prowesssoft.restservice;

public class Enrollment {

    private final long enrollmentId;
    private final long studentId;
    private final long courseId;
    private final String courseName;

    public Enrollment(long enrollmentId, long studentId, long courseId, String courseName) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public long getEnrollmentId() {
        return enrollmentId;
    }
    public long getStudentId() {
        return studentId;
    }
    public long getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
}
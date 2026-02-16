package org.example.Builders;
import org.example.Students.UndergraduateStudent;

public class UndergraduateStudentBuilder {
    private String studentId;
    private String name;
    private String email;
    private String department;
    private int creditHours;
    private double scholarshipAmount;

    public UndergraduateStudentBuilder setStudentId(String id) { this.studentId = id; return this; }
    public UndergraduateStudentBuilder setName(String name) { this.name = name; return this; }
    public UndergraduateStudentBuilder setEmail(String email) { this.email = email; return this; }
    public UndergraduateStudentBuilder setDepartment(String dept) { this.department = dept; return this; }

    // The specific fields you mentioned:
    public UndergraduateStudentBuilder setCreditHours(int hours) {
        this.creditHours = hours;
        return this;
    }
    public UndergraduateStudentBuilder setScholarshipAmount(double amount) {
        this.scholarshipAmount = amount;
        return this;
    }

    public UndergraduateStudent build() {
        return new UndergraduateStudent(studentId, name, email, department, creditHours, scholarshipAmount);
    }
}
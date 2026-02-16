package org.example.Builders;
import org.example.Students.GraduateStudent;

public class GraduateStudentBuilder {
    private String studentId;
    private String name;
    private String email;
    private String department;
    private boolean researchAssistant;
    private double stipend;

    public GraduateStudentBuilder setStudentId(String id) { this.studentId = id; return this; }
    public GraduateStudentBuilder setName(String name) { this.name = name; return this; }
    public GraduateStudentBuilder setEmail(String email) { this.email = email; return this; }
    public GraduateStudentBuilder setDepartment(String dept) { this.department = dept; return this; }

    // The specific Graduate fields
    public GraduateStudentBuilder setResearchAssistant(boolean isRA) {
        this.researchAssistant = isRA;
        return this;
    }
    public GraduateStudentBuilder setStipend(double stipend) {
        this.stipend = stipend;
        return this;
    }

    public GraduateStudent build() {
        return new GraduateStudent(studentId, name, email, department, researchAssistant, stipend);
    }
}
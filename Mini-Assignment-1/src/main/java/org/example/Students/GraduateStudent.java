package org.example.Students;

public class GraduateStudent extends Student {
    private boolean researchAssistant;
    private double stipend;

    public GraduateStudent(String id, String name, String email, String dept, boolean researchAssistant, double stipend) {
        this.studentId = id;
        this.name = name;
        this.email = email;
        this.department = dept;
        this.researchAssistant = researchAssistant;
        this.stipend = stipend;
    }

    @Override
    public double calculateTuition() {
        double baseFee = 6000.00;
        return researchAssistant ? (baseFee - stipend) : baseFee;
    }

    @Override
    public String getStudentType() {
        return "Graduate";
    }

    @Override
    public void displayStudentDetails() {

        System.out.println(" RA Status: " + researchAssistant +
                " Stipend: R" + stipend +
                " Final Tuition: R" + calculateTuition());
    }
}
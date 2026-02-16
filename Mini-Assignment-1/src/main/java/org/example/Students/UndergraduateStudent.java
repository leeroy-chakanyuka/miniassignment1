package org.example.Students;

public class UndergraduateStudent extends Student {
    private int creditHours;
    private double scholarshipAmount;


    public UndergraduateStudent(String id, String name, String email, String dept, int creditHours, double scholarshipAmount) {
        this.studentId = id;
        this.name = name;
        this.email = email;
        this.department = dept;
        this.creditHours = creditHours;
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        return (creditHours * 500.0) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println(" Credits: " + creditHours +
                " Scholarship: $" + scholarshipAmount +
                " Total Tuition: $" + calculateTuition()) ;
    }
}
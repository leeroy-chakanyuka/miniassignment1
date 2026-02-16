package org.example;
import org.example.Builders.GraduateStudentBuilder;
import org.example.Builders.UndergraduateStudentBuilder;
import org.example.Students.GraduateStudent;
import org.example.Students.UndergraduateStudent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Create Undergrad
        UndergraduateStudent ug = new UndergraduateStudentBuilder()
                .setStudentId("UG789")
                .setName("Khanya")
                .setCreditHours(12)
                .setScholarshipAmount(500.0)
                .build();


        GraduateStudent grad = new GraduateStudentBuilder()
                .setStudentId("GR101")
                .setName("Leeroy")
                .setResearchAssistant(true)
                .setStipend(1500.0)
                .build();


        ug.displayStudentDetails();
        grad.displayStudentDetails();
    }
}
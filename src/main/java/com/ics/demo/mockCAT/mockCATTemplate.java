package com.ics.demo.mockCAT;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class mockCATTemplate implements CommandLineRunner {
    private final MockRestClient mockRestClient;

    public mockCATTemplate(MockRestClient mockRestClient) {
        this.mockRestClient = mockRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = mockRestClient.registerStudent(new Student(9422L, "Mari"));
        System.out.println(student);
        if (student != null) {
            Student confirm = mockRestClient.findById(student.getStudentNumber());
            System.out.println(confirm);
            if (confirm == student) {
                List<Lecturer> allLecturers = mockRestClient.getAllLecturers();

                Appointment newAppointment = mockRestClient.newAppointment(new Appointment(confirm.getStudentNumber(), allLecturers.get(1).getId()));
                Appointment confirmAppointment = mockRestClient.confirmAppointment(confirm.getStudentNumber(), newAppointment.getAppointmentId());
                System.out.println(confirmAppointment);
            } else {
                System.err.println("Student confirmation failed");
            }
        }
    }
}

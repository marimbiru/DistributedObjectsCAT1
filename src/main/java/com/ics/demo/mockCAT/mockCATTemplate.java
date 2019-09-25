//package com.ics.demo.mockCAT;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class mockCATTemplate implements CommandLineRunner {
//    private final MockRestClient mockRestClient;
//
//    public mockCATTemplate(MockRestClient mockRestClient) {
//        this.mockRestClient = mockRestClient;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Student student = mockRestClient.registerStudent(new Student(94622L, "Mari"));
//        System.out.println(student.getId());
//        if (student != null) {
//            Student confirm = mockRestClient.findByStudentNumber(student.getStudentNumber());
//            System.out.println(confirm.getId());
//            if (confirm.getStudentNumber().equals( student.getStudentNumber())) {
//
//                Appointment newAppointment = mockRestClient.createAppointment(new Appointment(student.getId(),(long)2));
//                Appointment confirmAppointment = mockRestClient.confirmAppointment(confirm.getStudentNumber(), newAppointment.getAppointmentId());
//                System.out.println(confirmAppointment);
//            } else {
//                System.err.println("Student confirmation failed");
//            }
//        }
//    }
//}

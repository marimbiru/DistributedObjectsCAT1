package com.ics.demo.mockCAT;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Student {

    private Long studentNumber;

    private String firstName;

    private  Student(){}

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Student(Long studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }
}


package com.ics.demo.mockCAT;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Appointment {
    private Long appointmentId;
    private Long studentId;
    private Long lecturerId;

    public Appointment() {
    }

    public Appointment(Long studentId, Long lecturerId) {
        this.studentId = studentId;
        this.lecturerId = lecturerId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }
}

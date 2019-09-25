package com.ics.demo.CATPrac.models;

public class Rejection {
    private Long studentId;
    private Long departmentId;
    private Long companyId;

    public Rejection(Long studentId, Long departmentId, Long companyId) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.companyId = companyId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}

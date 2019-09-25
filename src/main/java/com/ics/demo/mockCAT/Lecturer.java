package com.ics.demo.mockCAT;

import javax.persistence.Entity;

public class Lecturer {
    private Long id;
    private Long name;

    public Lecturer() {
    }

    public Lecturer(Long id, Long name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }
}

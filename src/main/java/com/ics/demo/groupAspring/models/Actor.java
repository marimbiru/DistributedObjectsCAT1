package com.ics.demo.groupAspring.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @NotNull(groups = Movie.Update.class)
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Movie.Create.class)
    private String name;


    @Column(name = "gender")
    @NotNull(groups = Movie.Create.class)
    private String gender;

    private Actor(){}

    public Actor(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public interface  Create{}
    public interface  Update{}
}

package com.ics.demo.groupAspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @NotNull(groups = Actor.Update.class)
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Actor.Create.class)
    private String name;


    @Column(name = "gender")
    @NotNull(groups = Actor.Create.class)
    private String gender;

    @ManyToOne
    @JoinColumn(name = "movie_id_fk")
    private Movie movie;

    private Actor() { }

    public Actor(String name, String gender, Movie movie) {
        this.name = name;
        this.gender = gender;
        this.movie = movie;
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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public interface Create { }

    public interface Update { }
}

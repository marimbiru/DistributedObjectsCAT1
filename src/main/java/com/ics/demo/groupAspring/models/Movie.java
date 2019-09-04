package com.ics.demo.groupAspring.models;
import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "year_released")
    private String yearReleased;

    private Movie(){}

    public Movie(String name, String year) {
        this.name = name;
        this.yearReleased = year;
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

    public String getYear() {
        return yearReleased;
    }

    public void setYear(String year) {
        this.yearReleased = year;
    }

    public interface  Create{}
    public interface  Update{}
}
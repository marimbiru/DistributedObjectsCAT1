package com.ics.demo.groupAspring.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "category_movies",
            joinColumns = @JoinColumn(name = "category_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id",referencedColumnName = "id")
    )
    private Set<Movie> movies = new HashSet<>();

    public Category(String name) {
        this.name = name;
    }

    private Category(){

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

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public void addMovies(Movie movie){
        this.movies = movies;
    }
}

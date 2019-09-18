package com.ics.demo.groupAspring.models;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @NotNull(groups = Update.class)
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Create.class)
    private String name;

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @OneToMany(mappedBy = "movie")
    private List<Actor> actors;

    @ManyToMany(mappedBy = "movies")
    private Set<Category> categories = new HashSet<Category>();

    @Column(name = "year_released")
    private String yearReleased;

    private Movie(){}

    public Movie(String name, String year) {
        this.name = name;
        this.yearReleased = year;
//        this.categories.addAll((categories));
//        this.categories = categories;
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

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actors=" + actors +
                ", categories=" + categories +
                ", yearReleased='" + yearReleased + '\'' +
                '}';


    }

    public interface  Create{}
    public interface  Update{}
}

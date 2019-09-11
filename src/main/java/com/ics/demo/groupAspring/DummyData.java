package com.ics.demo.groupAspring;

import com.ics.demo.groupAspring.models.Category;
import com.ics.demo.groupAspring.models.Movie;
import com.ics.demo.groupAspring.repositories.ActorRepository;
import com.ics.demo.groupAspring.repositories.CategoryRepository;
import com.ics.demo.groupAspring.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DummyData implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    private final CategoryRepository categoryRepository;

    public DummyData(MovieRepository movieRepository, ActorRepository actorRepository, CategoryRepository categoryRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        ArrayList<Actor> actorList = new ArrayList<Actor>();
//        actorList.add(new Actor("Margot Robbie","female"));
//        actorList.add(new Actor("Will Smith", "male"));

        Category category = categoryRepository.save(new Category("Action"));
        Category category1 = categoryRepository.save(new Category("thriller"));

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Fast and Slow", "1990"));
        movieList.add(new Movie("Slow and Fast", "1989"));

//        actorRepository.saveAll(actorList);
        movieRepository.saveAll(movieList);

    }
}

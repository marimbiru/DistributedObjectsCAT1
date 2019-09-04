package com.ics.demo.groupAspring;

import com.ics.demo.groupAspring.models.Actor;
import com.ics.demo.groupAspring.models.Movie;
import com.ics.demo.groupAspring.repositories.ActorRepository;
import com.ics.demo.groupAspring.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DummyData implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    public DummyData(MovieRepository movieRepository, ActorRepository actorRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Actor> actorList = new ArrayList<Actor>();
        actorList.add(new Actor("Margot Robbie","female"));
        actorList.add(new Actor("Will Smith", "male"));

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Fast and Slow", "1990"));
        movieList.add(new Movie("Slow and Fast", "1989"));

        actorRepository.saveAll(actorList);
        movieRepository.saveAll(movieList);

    }
}

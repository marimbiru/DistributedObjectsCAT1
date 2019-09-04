package com.ics.demo.groupAspring;

import com.ics.demo.groupAspring.models.Movie;
import com.ics.demo.groupAspring.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData implements CommandLineRunner {

    private final MovieRepository movieRepository;

    public DummyData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Fast and Slow", "1990"));
        movieList.add(new Movie("Slow and Fast", "1989"));

        movieRepository.saveAll(movieList);

    }
}

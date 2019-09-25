package com.ics.demo.groupAspring;

import com.ics.demo.groupAspring.models.Category;
import com.ics.demo.groupAspring.models.Movie;
import com.ics.demo.groupAspring.repositories.ActorRepository;
import com.ics.demo.groupAspring.repositories.CategoryRepository;
import com.ics.demo.groupAspring.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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


        Movie movie1 = new Movie("Fast and Slow", "1990" );
        Movie movie2 = new Movie("Slow and Fast", "1989");
        //movie1.getCategories().add(category);
        //movie2.getCategories().add(category1);

        //category.getMovies().add(movie1);
        //category1.getMovies().add(movie2);

        movieRepository.save(movie1);
        movieRepository.save(movie2);
        //categoryRepository.save(category);



//        category.addMovies(movie1);
//        category.addMovies(movie2);
//        category1.addMovies(movie1);

////        actorRepository.saveAll(actorList);
//        movieRepository.save(movie1);
//        movieRepository.save(movie2);
//        categoryRepository.save(category);
//        categoryRepository.save(category1);

    }
}

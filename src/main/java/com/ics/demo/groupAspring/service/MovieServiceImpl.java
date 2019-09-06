package com.ics.demo.groupAspring.service;

import com.ics.demo.groupAspring.NotFoundException;
import com.ics.demo.groupAspring.models.Actor;
import com.ics.demo.groupAspring.models.Movie;
import com.ics.demo.groupAspring.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final ActorService actorService;

    public MovieServiceImpl(MovieRepository movieRepository, ActorService actorService) {
        this.movieRepository = movieRepository;
        this.actorService = actorService;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id).orElseThrow(()->new NotFoundException("No record with id "+id+" found"));
    }

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie) {
        Movie foundMovie = findById(movie.getId());
        foundMovie.setName(movie.getName());
        foundMovie.setYearReleased(movie.getYearReleased());
        return movieRepository.save(foundMovie);
    }

    @Override
    public Movie update(Long id, Movie movie) {
        Movie foundMovie = findById(id);
        foundMovie.setName(movie.getName());
        foundMovie.setYearReleased(movie.getYearReleased());
        return movieRepository.save(foundMovie);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Actor createActor(Long id, Actor actor) {
        Movie movie = findById(id);
        actor.setMovie(movie);
        return actorService.create(actor);
    }
}

package com.movies.movie_info_spring.controller;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movie_info_spring.entity.Movie;
import com.movies.movie_info_spring.service.MovieService;



@RestController
@RequestMapping("/movie")

public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/id={id}")
    public Optional<Movie> getMovieById(@PathVariable long id){
        return movieService.getMovieById(id);
    }

    @PostMapping
    public ResponseEntity<Movie> postMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.postMovie(movie),HttpStatus.CREATED);
    }
    
}

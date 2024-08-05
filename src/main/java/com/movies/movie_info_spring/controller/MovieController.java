package com.movies.movie_info_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
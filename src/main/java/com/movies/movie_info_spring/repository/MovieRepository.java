package com.movies.movie_info_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movies.movie_info_spring.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{

    
} 
package com.movies.movie_info_spring.entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "movie"})
public class Movie {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private Date releaseDate;
    private double rating;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "director_id")
  
    private Director director;

    // @ManyToMany
    // @JoinTable(
    //     name = "MovieGenres",
    //     joinColumns = @JoinColumn(name = "movieID"),
    //     inverseJoinColumns = @JoinColumn(name = "genreID")
    // )
    // private Set<Genre> genres;

    // @OneToMany(mappedBy = "movie")
    // private Set<MovieActor> actors;
}

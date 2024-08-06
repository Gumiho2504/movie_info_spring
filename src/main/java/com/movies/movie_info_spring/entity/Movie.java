package com.movies.movie_info_spring.entity;

import java.util.Date;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
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
@Table(name = "movies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "actor"})
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

    @ManyToMany
    @JoinTable(
        name = "movie_genres",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres;

    // @ManyToMany
    // @JoinTable(
    //     name = "movie_actors",
    //     joinColumns = @JoinColumn(name = "movie_id"),
    //     inverseJoinColumns = @JoinColumn(name = "actor_id")
    // )
    //  @JsonBackReference
    // private Set<Actor> actors;
    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)

    private Set<MovieActor> actors;
}

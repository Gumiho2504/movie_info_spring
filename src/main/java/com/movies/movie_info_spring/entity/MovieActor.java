package com.movies.movie_info_spring.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@Entity
@Table(name = "movie_actors")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(MovieActorId.class)

public class MovieActor implements Serializable{
   
    @Id
    @Column(name = "movie_id")
    private long movie_id;

    @Id
    @Column(name = "actor_id")
    private long actor_id;

   
    @ManyToOne
    @MapsId("movie_id")
    @JoinColumn(name = "movie_id", insertable = false, updatable = false)
    private Movie movie;

    @ManyToOne
    @MapsId("actor_id")
    @JoinColumn(name = "actor_id", insertable = false, updatable = false)
    private Actor actor;

    private String role;
}

// package com.movies.movie_info_spring.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.IdClass;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// @Data
// @Builder
// @AllArgsConstructor
// @NoArgsConstructor
// @Entity
// @IdClass(MovieActorId.class)
// @Table(name = "MovieActors")
// public class MovieActor {
//     @Id
//     @ManyToOne
//     @JoinColumn(name = "movieID")
//     private Movie movie;

//     @Id
//     @ManyToOne
//     @JoinColumn(name = "actorID")
//     private Actor actor;

//     private String role;
// }

// package com.movies.movie_info_spring.entity;

// import java.io.Serializable;
// import java.util.Objects;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// @Data
// @Builder
// @AllArgsConstructor
// @NoArgsConstructor
// public class MovieActorId implements Serializable {
//     private int movie_id;
//     private int actor_id;


//         // equals and hashCode methods
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         MovieActorId that = (MovieActorId) o;
//         return movie_id == that.movie_id && actor_id == that.actor_id;
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(movie_id, actor_id);
//     }
// }

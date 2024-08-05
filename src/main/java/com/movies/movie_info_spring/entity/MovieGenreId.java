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
// public class MovieGenreId implements Serializable {
//     private int movieID;
//     private int genreID;

//     // equals and hashCode methods
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         MovieGenreId that = (MovieGenreId) o;
//         return movieID == that.movieID && genreID == that.genreID;
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(movieID, genreID);
//     }
// }

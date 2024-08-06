package com.movies.movie_info_spring.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@EqualsAndHashCode
public class MovieActorId implements Serializable {

    private long movie_id;
    private long actor_id;


    // equals and hashCode methods
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     MovieActorId that = (MovieActorId) o;
    //     return movie_id == that.movie_id && actor_id == that.actor_id;
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(movie_id, actor_id);
    // }
}

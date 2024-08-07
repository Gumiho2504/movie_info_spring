package com.movies.movie_info_spring.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
@Table(name = "directors")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Director {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    

    // @OneToMany(mappedBy = "director",cascade = CascadeType.ALL)
    // @JsonManagedReference
    // private List<Movie> movie;
    
}

package com.movies.movie_info_spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.movie_info_spring.entity.Actor;
import com.movies.movie_info_spring.repository.ActorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActorService {
    
    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActor(){
        return actorRepository.findAll();
    }

    public Optional<Actor> findActorById(long id){
        return actorRepository.findById(id);
    }
}

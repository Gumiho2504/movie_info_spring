package com.movies.movie_info_spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movie_info_spring.entity.Actor;
import com.movies.movie_info_spring.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService actorService = new ActorService();

    @GetMapping
    public List<Actor> getAllActor(){
        return actorService.getAllActor();
    }

    @GetMapping("/id={id}")
    public Optional<Actor> getActorById(@PathVariable long id){
        return actorService.findActorById(id);
    }
}

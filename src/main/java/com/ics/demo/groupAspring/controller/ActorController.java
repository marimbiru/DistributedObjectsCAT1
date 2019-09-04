package com.ics.demo.groupAspring.controller;

import com.ics.demo.groupAspring.models.Actor;
import com.ics.demo.groupAspring.models.Movie;
import com.ics.demo.groupAspring.service.ActorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "actors")
public class ActorController {
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> findAll(){
        return actorService.findAll();
    }

    @GetMapping(value = "{id}")
    public Actor findById(@PathVariable Long id){
        return actorService.findById(id);
    }

    @PostMapping
    public Actor create (@Validated({Actor.Create.class}) @RequestBody Actor actor){
        return actorService.create(actor);
    }

    @PatchMapping
    public Actor update(@Validated({Actor.Update.class}) @RequestBody Actor actor){
        return actorService.update(actor);
    }

    @PatchMapping(value = "{id}")
    public Actor update(@Validated({Actor.Update.class}) @PathVariable Long id, @RequestBody Actor actor){
        return actorService.update(id,actor);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id){
        actorService.delete(id);
    }
}

package com.api.apiMetallica.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.EventModel;
import com.api.apiMetallica.services.EventService;

@RestController

@RequestMapping("/events")

public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public ArrayList<EventModel> getEvents(){
        return eventService.getEvents();
    }

    @GetMapping(path = "/{id}")
     public Optional<EventModel> getEventById(@PathVariable("id") Long id) {
        return this.eventService.getEventById(id);

    }

}

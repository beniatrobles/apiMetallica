package com.api.apiMetallica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.EventosModel;
import com.api.apiMetallica.services.EventosService;

@RestController
@RequestMapping("/eventos")

public class EventosController {

    @Autowired
    private EventosService eventService;

    @GetMapping
    public List<EventosModel> getEvents() {
        return eventService.getEvents();
    }

    @GetMapping(path = "/{id}")
    public Optional<EventosModel> getEventById(@PathVariable("id") Long id) {
        return this.eventService.getEventById(id);

    }

}

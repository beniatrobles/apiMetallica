package com.api.apiMetallica.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.EventosModel;
import com.api.apiMetallica.repositories.IEventosRepository;

@Service

public class EventosService {

    @Autowired
    IEventosRepository eventRepository;

    public List<EventosModel> getEvents() {
        return eventRepository.findAll();
    }

    public Optional<EventosModel> getEventById(Long id) {
        return eventRepository.findById(id);
    }

}

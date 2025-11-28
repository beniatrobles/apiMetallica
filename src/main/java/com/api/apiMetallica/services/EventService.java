package com.api.apiMetallica.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.EventModel;
import com.api.apiMetallica.repositories.IEventRepository;

@Service

public class EventService {

    @Autowired
    IEventRepository eventRepository;

    public ArrayList<EventModel> getEvents(){
        return (ArrayList<EventModel>) eventRepository.findAll();
    }

    public Optional<EventModel> getEventById(Long id){
        return eventRepository.findById(id);
    }

}

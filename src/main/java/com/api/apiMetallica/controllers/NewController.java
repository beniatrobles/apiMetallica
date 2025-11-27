package com.api.apiMetallica.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.NewModel;
import com.api.apiMetallica.services.NewService;

@RestController
@RequestMapping("/news")

public class NewController {
    @Autowired
    private NewService newService;

    @GetMapping
    public ArrayList<NewModel> getNews(){
        return newService.getNews();
    }

    @GetMapping(path = "/{id}")
    public Optional<NewModel> getNewById(@PathVariable("id") Long id){
        return this.newService.getNewById(id);
    }
}

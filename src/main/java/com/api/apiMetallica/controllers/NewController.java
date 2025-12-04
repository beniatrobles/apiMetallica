package com.api.apiMetallica.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.NewModel;
import com.api.apiMetallica.services.NewService;

import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/news")
// @CrossOrigin(origins = "http://localhost:8080")

public class NewController {
    @Autowired
    private NewService newService;

    @GetMapping
    public ArrayList<NewModel> getNews() {
        return newService.getNews();
    }

    @GetMapping("/paginate")
    public Page<NewModel> getNewsPaginate(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {
        return newService.getNewsPaginate(page, size);
    }

    @GetMapping(path = "/{id}")
    public Optional<NewModel> getNewById(@PathVariable("id") Long id) {
        return this.newService.getNewById(id);
    }
}

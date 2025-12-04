package com.api.apiMetallica.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.AlbumModel;
import com.api.apiMetallica.services.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

@RequestMapping("/albums")

public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public ArrayList<AlbumModel> getAlbums() {
        return albumService.getAlbums();
    }

    @GetMapping(path = "/{id}")
    public Optional<AlbumModel> getAlbumById(@PathVariable("id") Long id) {
        return this.albumService.getAlbumById(id);
    }

    @GetMapping("/random")
    public List<AlbumModel> getRandomAlbums() {
        return albumService.getRandom3Albums();
    }

}

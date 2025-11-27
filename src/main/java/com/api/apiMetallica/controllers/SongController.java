package com.api.apiMetallica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.SongModel;
import com.api.apiMetallica.services.SongService;

@RestController
@RequestMapping("/songs")

public class SongController {

    @Autowired
    private SongService songService;

      // Obtener todas las canciones
    @GetMapping
    public List<SongModel> getAllSongs() {
        return songService.getAllSongs();
    }


     // Obtener canción por ID
    @GetMapping("/{id}")
    public Optional<SongModel> getSongById(@PathVariable Long id) {
        return songService.getSongById(id);
    }

    // Obtener canciones de un álbum
    @GetMapping("/album/{albumId}")
    public List<SongModel> getSongsByAlbum(@PathVariable Long albumId) {
        return songService.getSongsByAlbumId(albumId);
    }

}

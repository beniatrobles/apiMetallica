package com.api.apiMetallica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.SongModel;
import com.api.apiMetallica.repositories.ISongRepository;

@Service

public class SongService {

    @Autowired
    ISongRepository songRepository;

    // Obtener todas las canciones
    public List<SongModel> getAllSongs() {
        return (List<SongModel>) songRepository.findAll();
    }

    // Obtener canciones de un álbum
    public List<SongModel> getSongsByAlbumId(Long albumId) {
        
        List<SongModel> songs = songRepository.findByAlbumId(albumId);
        
        return songs;
    }

    // Obtener canción por ID
    public Optional<SongModel> getSongById(Long id) {
        return songRepository.findById(id);
    }

}

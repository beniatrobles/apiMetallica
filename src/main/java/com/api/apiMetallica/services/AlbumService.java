package com.api.apiMetallica.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.AlbumModel;
import com.api.apiMetallica.repositories.IAlbumRepository;

@Service

public class AlbumService {
    @Autowired
    IAlbumRepository albumRepository;


    //Conseguir todos los albumes
    public ArrayList<AlbumModel> getAlbums(){
        return (ArrayList<AlbumModel>) albumRepository.findAll();
    }

    //conseguir album por id

    public Optional<AlbumModel> getAlbumById(Long id){
        return albumRepository.findById(id);
    }

    


}

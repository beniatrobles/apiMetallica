package com.api.apiMetallica.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.NewModel;
import com.api.apiMetallica.repositories.INewRepository;

@Service

public class NewService {

    @Autowired
    INewRepository newRepository;


    // conseguir todas las noticias
    public ArrayList<NewModel> getNews(){
        return (ArrayList<NewModel>) newRepository.findAll();
    }

    // conseguir noticia por id
    public Optional<NewModel> getNewById(Long id){
        return newRepository.findById(id);
    }

}

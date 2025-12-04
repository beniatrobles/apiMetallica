package com.api.apiMetallica.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.NewModel;
import com.api.apiMetallica.repositories.INewRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@Service

public class NewService {

    @Autowired
    INewRepository newRepository;


    // conseguir todas las noticias
    public ArrayList<NewModel> getNews(){
        return (ArrayList<NewModel>) newRepository.findAll();
    }

    // conseguir noticias paginadas
    public Page<NewModel> getNewsPaginate(int page, int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("fechaPublicacion").descending());
        return newRepository.findAll(pageable);
    }
    

    // conseguir noticia por id
    public Optional<NewModel> getNewById(Long id){
        return newRepository.findById(id);
    }

}

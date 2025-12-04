package com.api.apiMetallica.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.MerchModel;
import com.api.apiMetallica.repositories.IMerchRepository;

@Service

public class MerchService {

    @Autowired
    IMerchRepository merchRepository;

    //conseguir todas las merchs

    public ArrayList<MerchModel> getMerchs(){
        return (ArrayList<MerchModel>) merchRepository.findAll();
    }


    //conseguir merch por id

    public Optional<MerchModel> getMerchById(Long id){
        return merchRepository.findById(id);
    }


    public List<MerchModel> getTop5Merch() {
        return merchRepository.findTop5Merch();
    }


}

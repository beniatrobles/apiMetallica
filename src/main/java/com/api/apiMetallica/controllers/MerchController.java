package com.api.apiMetallica.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.MerchModel;
import com.api.apiMetallica.services.MerchService;

@RestController
@RequestMapping("/merchs")

public class MerchController {

    @Autowired
    private MerchService merchService;

    @GetMapping
    public ArrayList<MerchModel> getMerchs(){
        return merchService.getMerchs();
    }

     @GetMapping(path = "/{id}")
     public Optional<MerchModel> getMerchById(@PathVariable("id") Long id){
        return this.merchService.getMerchById(id);
    }

    @GetMapping("/top5")
    public List<MerchModel> getTop5Merch() {
        return merchService.getTop5Merch();
    }

}

package io.developerkhusanjon.moviecatalog.controller;


import io.developerkhusanjon.moviecatalog.catalogs.Catalog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class MainController {

    @RequestMapping("{catalogId}")
    public List<Catalog> getCatalogs(String catalogId){
        return List.of(new Catalog("1234","Social Dilemma","Documentary",9));
    }
}

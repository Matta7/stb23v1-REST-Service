package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.services.STBHTMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class STBHTMLController {

    @Autowired
    private STBHTMLService stbhtmlService;

    @RequestMapping(
            value = {"/stb23/resume"},
            //produces = ,
            method = RequestMethod.GET
    )
    public String list() {
        return stbhtmlService.getList();
    }

    @RequestMapping(
            value = {"/stb23/html/{id}"},
            //produces = ,
            method = RequestMethod.GET
    )
    public String get(@PathVariable String id) {
        return stbhtmlService.getById(id);
    }
}
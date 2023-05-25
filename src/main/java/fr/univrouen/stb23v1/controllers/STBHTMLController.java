package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.services.STBHTMLService;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
public class STBHTMLController {

    @Autowired
    private STBHTMLService stbhtmlService;

    @RequestMapping(
            value = {"/stb23/resume"},
            //produces = ,
            method = RequestMethod.GET
    )
    public String list() throws JAXBException, IOException, TransformerException {
        return stbhtmlService.getList();
    }

    @RequestMapping(
            value = {"/stb23/html/{id}"},
            //produces = ,
            method = RequestMethod.GET
    )
    public String get(@PathVariable String id) throws JAXBException, TransformerException, IOException {
        return stbhtmlService.getById(id);
    }
}
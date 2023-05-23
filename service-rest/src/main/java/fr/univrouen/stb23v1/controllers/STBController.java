package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.services.STBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class STBController {

    @Autowired
    private STBService stbService;

    @RequestMapping(
            value = {"stb23/insert"},
            produces = MediaType.APPLICATION_XML_VALUE,
            method = RequestMethod.POST
    )
    public String insert() {
        return stbService.insert();
    }

    @RequestMapping(
            value = {"stb23/delete/{id}"},
            produces = MediaType.APPLICATION_XML_VALUE,
            method = RequestMethod.DELETE
    )
    public String delete(@PathVariable(value = "id") String id) {
        return stbService.delete(id);
    }
}
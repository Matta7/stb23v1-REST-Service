package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.services.STBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class STBController {

    @Autowired
    private STBService stbService;

    @RequestMapping(
            value = {"stb23/insert"},
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE,
            method = RequestMethod.POST
    )
    public String insert(@RequestBody String xml) {
        return stbService.insert(xml);
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
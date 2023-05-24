package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.services.STBXMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class STBXMLController {

    @Autowired
    private STBXMLService stbxmlService;

    @RequestMapping(
            value = {"/stb23/resume/xml"},
            produces = MediaType.APPLICATION_XML_VALUE,
            method = RequestMethod.GET
    )
    public String list() {
        return stbxmlService.getList();
    }

    @RequestMapping(
            value = {"/stb23/xml/{id}"},
            produces = MediaType.APPLICATION_XML_VALUE,
            method = RequestMethod.GET
    )
    public String get(@PathVariable String id) {
        return stbxmlService.getById(id);
    }

    @RequestMapping(
            value = {"/stb23/xml/test"},
            produces = MediaType.APPLICATION_XML_VALUE,
            method = RequestMethod.GET
    )
    public String test() {
        return stbxmlService.deserializeXml();
    }
}

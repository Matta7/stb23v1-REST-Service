package fr.univrouen.stb23v1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class STBXMLController {

    /**
     * List ...
     * @return
     */
    @GetMapping("/stb23/resume/xml")
    public String list() {
        return "Envoi de la liste des STB";
    }

    /**
     * Get ...
     * @param id
     * @return
     */
    @GetMapping("/stb23/xml/{id}")
    public String get(@PathVariable String id) {
        return ("Détail de la STB n°" + id);
    }
}

package fr.univrouen.stb23v1.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class STBController {

    /**
     * List ...
     * @return
     */
    @GetMapping("/stb23/resume")
    public String list() {
        return "Envoi de la liste des STB";
    }

    /**
     * Get ...
     * @param id
     * @return
     */
    @GetMapping("/stb23/html/{id}")
    public String get(@PathVariable String id) {
        return ("Détail de la STB n°" + id);
    }

    @PostMapping(value = "/stb23/insert", produces = MediaType.APPLICATION_XML_VALUE)
    public String insert(@RequestBody String flux) {
        return flux;
    }

    @DeleteMapping(value = "/stb23/delete/{id}")
    public String delete(@PathVariable String id, @RequestBody String flux) {
        return flux;
    }
}

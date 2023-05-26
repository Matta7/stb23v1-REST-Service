package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.model.services.STBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class STBController {

    @Autowired
    private STBService stbService;

    @RequestMapping(
            value = { "/stb23/list" },
            method = RequestMethod.GET
    )
    public String list(Model model) {
        model.addAttribute("stbList", stbService.getSTBList().getStbList());
        /*
        <h2>${stb.title}</h2>
        <p>Id : ${stb.id}</p>
        <p>Date : ${stb.date}</p>
        <p>Client Entity : ${stb.clientEntity}</p>
        <p>Description : ${stb.description}</p>
         */
        return "pages/stb23/list";
    }

    @RequestMapping(
            value = { "/stb23/{id}" },
            method = RequestMethod.GET
    )
    public String get(@PathVariable String id, Model model) {
        model.addAttribute("stb", stbService.getSTBDetail(id));
        return "pages/stb23/detail";
    }

    @RequestMapping(
            value = { "/stb23/insert" },
            method = RequestMethod.POST
    )
    public String insert(@RequestBody String form) {
        return form;
    }

    @RequestMapping(
            value = { "/stb23/delete/{id}" },
            method = RequestMethod.POST
    )
    @DeleteMapping(value = "/stb23/delete/{id}")
    public String delete(@PathVariable String id) {
        return "$";
    }
}

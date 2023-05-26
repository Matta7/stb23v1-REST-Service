package fr.univrouen.stb23v1.controllers;

import fr.univrouen.stb23v1.model.entities.ResultRequest;
import fr.univrouen.stb23v1.model.services.STBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

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
            method = RequestMethod.GET
    )
    public String insertForm() {
        return "pages/stb23/insert";
    }

    @RequestMapping(
            value = { "/stb23/insert" },
            method = RequestMethod.POST
    )
    public RedirectView insert(String xml) throws IOException {
        ResultRequest resultRequest = stbService.insertSTB(xml);

        if (resultRequest.getStatus().equals("INSERTED")) {
            RedirectView redirectView = new RedirectView();
            redirectView.setUrl("/stb23/" + resultRequest.getId());
            return redirectView;
        }

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/stb23/insert");
        return redirectView;
    }

    @RequestMapping(
            value = { "/stb23/delete/{id}" },
            method = RequestMethod.POST
    )
    public RedirectView delete(@PathVariable String id) throws IOException {
        ResultRequest resultRequest = stbService.deleteSTB(id);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/stb23/list");
        return redirectView;
    }
}

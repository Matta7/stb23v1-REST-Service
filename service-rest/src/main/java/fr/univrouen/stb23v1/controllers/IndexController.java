package fr.univrouen.stb23v1.controllers;
import fr.univrouen.stb23v1.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(
            value = {"/"},
            //produces = ,
            method = RequestMethod.GET
    )
    public String index() {
        return homeService.getHTMLHomePage();
    }

    @RequestMapping(
            value = {"/help"},
            //produces = "application/html",
            method = RequestMethod.GET
    )
    public String help() {
        return homeService.getHTMLHelpPage();
    }
}

package fr.univrouen.stb23v1.controllers;
import fr.univrouen.stb23v1.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(
            value = { "/" },
            method = RequestMethod.GET
            //produces = "application/html"
    )
    @ResponseBody
    public String index() {
        return homeService.getHTMLHomePage();
    }

    @RequestMapping(
            value = {"/help" },
            method = RequestMethod.GET
            //produces = "application/html"
    )
    @ResponseBody
    public String help() {
        return homeService.getHTMLHelpPage();
    }
}

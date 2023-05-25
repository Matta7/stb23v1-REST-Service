package fr.univrouen.stb23v1.controllers;
import fr.univrouen.stb23v1.model.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @Autowired
    HomeService homeService;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String index(Model model) {
        String htmlPage = homeService.getHomePage();
        model.addAttribute("page", htmlPage);
        return "index";
    }

    @RequestMapping(
            value = {"/help" },
            method = RequestMethod.GET
    )
    public String help(Model model) {
        String htmlPage = homeService.getHelpPage();
        model.addAttribute("page", htmlPage);
        return "pages/help/help";
    }
}

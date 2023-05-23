package fr.univrouen.stb23v1.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String getHTMLHomePage() {
        return "homepage";
    }

    public String getHTMLHelpPage() {
        return "help";
    }
}

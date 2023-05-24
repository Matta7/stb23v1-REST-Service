package fr.univrouen.stb23v1.model.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    final String uri = "http://localhost:8080";

    public String getHomePage() {
        return "";
    }
}

package fr.univrouen.stb23v1.model.services;

import fr.univrouen.stb23v1.model.api.HomeRequest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;



@Service
public class HomeService {

    HomeRequest homeRequest = new HomeRequest();

    public String getHomePage() {

        String result = homeRequest.homePageRequest();

        Document document = Jsoup.parse(result.split("<!DOCTYPE html>")[1]);
        System.out.println(document.body().text());

        return homeRequest.homePageRequest();
    }

    public String getHelpPage() {
        return homeRequest.helpPageRequest();
    }
}

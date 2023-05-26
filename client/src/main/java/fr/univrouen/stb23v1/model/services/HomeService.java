package fr.univrouen.stb23v1.model.services;

import fr.univrouen.stb23v1.model.api.HomeRequest;
import fr.univrouen.stb23v1.model.utils.StringHTMLManipulation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    HomeRequest homeRequest = new HomeRequest();

    public String getHomePage() {

        String result = homeRequest.homePageRequest();

        Document document = Jsoup.parse(result.split("<!DOCTYPE html>")[1]);

        return StringHTMLManipulation.addNavMenu(document);
    }

    public String getHelpPage() {
        String result = homeRequest.helpPageRequest();

        Document document = Jsoup.parse(result.split("<!DOCTYPE html>")[1]);

        return StringHTMLManipulation.addNavMenu(document);
    }
}

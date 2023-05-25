package fr.univrouen.stb23v1.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    /**
     * Get in an HTML format the home page.
     * @return the home page in a String.
     */
    public String getHTMLHomePage() {
        StringBuilder homePage = new StringBuilder();
        homePage.append("<!DOCTYPE html>");

        homePage.append(
                "\n<html lang=\"fr\">"
                + "\n<head>"
                + "\n\t<title>Page d'accueil</title>"
                + "\n</head>"
        );

        homePage.append(
                "\n<body>"
                + "\n\t<h1>Service REST & Client</h1>"
                + "\n\t<p>Version 1.0</p>"
                + "\n\t<h2>Développeurs :</h2>"
                + "\n\t<ul>"
                + "\n\t\t<li>MERRE Alexandre</li>"
                + "\n\t\t<li>VALLEE Mathieu</li>"
                + "\n\t</ul>"
                + "\n\t<img src=\"https://communaute-universitaire.univ-rouen.fr/images/logo.png\" alt=\"Logo univ-rouen\"/>"
                + "\n</body>"
        );

        homePage.append("\n</html>");
        return homePage.toString();
    }

    /**
     * Get in an HTML format the help page.
     * @return the help page in a String.
     */
    public String getHTMLHelpPage() {
        List<String> serviceName = new ArrayList<>();
        serviceName.add("Page d'accueil");
        serviceName.add("Aide");
        serviceName.add("Liste des STB - Format XML");
        serviceName.add("Liste des STB - Format HTML");
        serviceName.add("Détail d’une spécification - Format XML");
        serviceName.add("Détail d’une spécification - Format HTML");
        serviceName.add("Ajout d’une STB dans la base");
        serviceName.add("Suppression d’une spécification");

        List<String> urlList = new ArrayList<>();
        urlList.add("/");
        urlList.add("/help");
        urlList.add("/stb23/resume/xml");
        urlList.add("/stb23/resume");
        urlList.add("/stb23/xml/{id}");
        urlList.add("/stb23/html/{id}");
        urlList.add("/stb23/insert");
        urlList.add("/stb23/delete/{id}");

        List<String> methodsList = new ArrayList<>();
        methodsList.add("GET");
        methodsList.add("GET");
        methodsList.add("GET");
        methodsList.add("GET");
        methodsList.add("GET");
        methodsList.add("GET");
        methodsList.add("POST");
        methodsList.add("DELETE");

        List<String> operationResumeList = new ArrayList<>();
        operationResumeList.add("Format HTML ou XHTML valide. Affiche la page d’accueil.");
        operationResumeList.add("Format HTML ou XHTML valide. Affiche la page contenant les informations d’aide.");
        operationResumeList.add("Flux XML. Affiche la liste des spécifications stockées.");
        operationResumeList.add("Page HTML (ou XHTML). Affiche la liste des spécifications stockées.");
        operationResumeList.add("Flux XML conforme au schéma xsd comprenant une seule STB. Affiche le contenu complet de la spécification dont l’identifiant est {id}.");
        operationResumeList.add("Page HTML (ou XHTML). Affiche le contenu complet de la spécification dont l’identifiant est {id}");
        operationResumeList.add("Flux XML. Le flux reçu est validé par le schéma XSD de définition stb23");
        operationResumeList.add("Flux XML. Suppression de la spécification dont l’identifiant est {id}\n");


        StringBuilder helpPage = new StringBuilder();
        helpPage.append("<!DOCTYPE html>");

        helpPage.append(
                "\n<html lang=\"fr\">"
                        + "\n<head>"
                        + "\n\t<title>Aide</title>"
                        + "\n</head>"
        );

        helpPage.append("\n<body>");
        helpPage.append("\n\t<h1>Page d'aide</h1>");
        helpPage.append("\n\t<h2>Liste des opérations proposées par le service REST :</h2>");

        int i=0;
        for(String name : serviceName) {
            helpPage.append("\n\t<h3>" + name + "</h3>");
            helpPage.append("\n\t<p>URL : " + urlList.get(i) + "</p>");
            helpPage.append("\n\t<p>Méthode attendue : " + methodsList.get(i) + "</p>");
            helpPage.append("\n\t<p>Résumé de l'opération (format attendu, format de retour, ...) : " + operationResumeList.get(i) + "</p>");
            i++;
        }

        helpPage.append("\n</body>");

        helpPage.append("\n</html>");
        return helpPage.toString();
    }
}

package fr.univrouen.stb23v1.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    /**
     * Get in an HTML format the home page.
     * @return the home page in a String.
     */
    public String getHTMLHomePage() {
        StringBuilder homePage = new StringBuilder();
        homePage.append(
                "<html>"
                + "\n<head>"
                + "\n\t<title>Page d'accueil</title>"
                + "\n</head>"
        );

        homePage.append(
                "<body>"
                + "<h1>Service REST & Client</h1>"
                + "\n\t<p>Version 1.0</p>"
                + "\n\t<h2>Développeurs :</h2>"
                + "\n\t<ul>"
                + "\n\t\t<li>MERRE Alexandre</li>"
                + "\n\t\t<li>VALLEE Mathieu</li>"
                + "\n\t</ul>"
                + "\n\t<img src=\"https://communaute-universitaire.univ-rouen.fr/images/logo.png\"/>"
                + "</body>"
        );

        homePage.append("</html>");
        return homePage.toString();
    }

    /**
     * Get in an HTML format the help page.
     * @return the help page in a String.
     */
    public String getHTMLHelpPage() {
        StringBuilder helpPage = new StringBuilder();
        helpPage.append(
                "<html>"
                        + "\n<head>"
                        + "\n\t<title>Aide</title>"
                        + "\n</head>"
        );

        helpPage.append(
                "<body>"
                        + "<h1>Pour chaque service :</h1>\n" +
                        "    <p>Voici l'URL</p>\n" +
                        "    <p>Voici la méthode attendue</p>\n" +
                        "    <p>Voici le résumé de l'opération (format attendu, de retour, ...)</p>"
        );

        helpPage.append("</html>");
        return helpPage.toString();
    }
}

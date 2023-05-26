package fr.univrouen.stb23v1.model.utils;

import org.jsoup.nodes.Document;

public class StringHTMLManipulation {
    public static String addNavMenu(Document document) {
        StringBuilder nav = new StringBuilder();
        nav.append("\t<nav>\n");
        nav.append("\t\t<ul>\n");
        nav.append("\t\t\t<li><a href=\"/\">Accueil</a></li>");
        nav.append("\t\t\t<li><a href=\"/help\">Aide</a></li>");
        nav.append("\t\t\t<li><a href=\"stb23/list\">Liste des STBs</a></li>");
        nav.append("\t\t\t<li><a href=\"stb23/insert\">Ajouter une STB</a></li>");
        nav.append("\t\t</ul>\n");
        nav.append("\t</nav>\n");

        document.child(0).before(nav.toString());

        return document.html();
    }
}

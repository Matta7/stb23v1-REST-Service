package fr.univrouen.stb23v1.utils;

public class StatusGenerator {

    public static String generateStatusXML(String id, String status) {
        StringBuilder res = new StringBuilder();

        res.append("<result>\n");
        res.append("<id>").append(id).append("</id>\n");
        res.append("<status>").append(status).append("</status>\n");
        res.append("</result>");

        return res.toString();
    }

    public static String generateStatusInsertXML(String status, String detail) {
        StringBuilder res = new StringBuilder();

        res.append("<result>\n");
        res.append("<status>").append(status).append("</status>\n");
        res.append("<detail>").append(detail).append("</detail>\n");
        res.append("</result>");

        return res.toString();
    }
}

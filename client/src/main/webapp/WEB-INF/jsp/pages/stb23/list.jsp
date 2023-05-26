<%@ page import="fr.univrouen.stb23v1.model.entities.STBResume" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Liste des STBs</title>
</head>
<body>
    <h1>Liste des STBs</h1>
    <% for (STBResume stb : (List<STBResume>) request.getAttribute("stbList")) {%>
        <h2><% out.print(stb.getTitle()); %></h2>

    <% } %>
</body>
</html>

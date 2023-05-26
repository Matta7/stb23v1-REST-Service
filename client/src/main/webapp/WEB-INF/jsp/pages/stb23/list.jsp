<%@ page import="fr.univrouen.stb23v1.model.entities.STBResume" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Liste des STBs</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="/">Accueil</a></li>
            <li><a href="/help">Aide</a></li>
            <li><a href="/stb23/list">Liste des STBs</a></li>
            <li><a href="/stb23/insert">Ajouter une STB</a></li>
        </ul>
    </nav>

    <h1>Liste des STBs</h1>
    <% for (STBResume stb : (List<STBResume>) request.getAttribute("stbList")) {%>
        <h2><% out.print(stb.getTitle()); %></h2>
        <p>Id : <% out.print(stb.getId()); %></p>
        <p>Description : <% out.print(stb.getDescription()); %></p>
        <p>Date : <% out.print(stb.getDate()); %></p>
        <p>Client Entity : <% out.print(stb.getClientEntity()); %></p>
        <p><a href="<% out.print("/stb23/" + stb.getId()); %>">Detail</a></p>
        <form action="<% out.print("/stb23/delete/" + stb.getId()); %>" method="post">
            <button type="submit" class="btn-link">Supprimer</button>
        </form>
    <% } %>
</body>
</html>

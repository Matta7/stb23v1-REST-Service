<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création de STB</title>
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
    <h1>Entrez une STB en XML :</h1>
    <form action="/stb23/insert" method="post">
        <textarea rows="25" cols="70" name="xml"></textarea>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>

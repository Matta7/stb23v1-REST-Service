<%@ page import="fr.univrouen.stb23v1.model.entities.STB" %>
<%@ page import="fr.univrouen.stb23v1.model.entities.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% STB stb = (STB) request.getAttribute("stb"); %>
    <h1>${stb.getTitle()}</h1>
    <p>${stb.getDescription()}</p>
    <p>Version ${stb.getVersion()}</p>
    <p>Date : ${stb.getDate()}</p>

    <h2>Client</h2>
    <p>Entité : ${stb.getClient().getEntity()}</p>
    <p>Person : ${stb.getClient().getPerson().getGender()} ${stb.getClient().getPerson().getLastname()} ${stb.getClient().getPerson().getFirstname()}</p>
    <% if(stb.getClient().getMail() != null) { for (String mail : stb.getClient().getMail()) {%>
        <p>Mail : <% out.print(mail); %></p>
    <% }} %>
    <% if(stb.getClient().getTel() != null) { for (String tel : stb.getClient().getTel()) {%>
        <p>Tel : <% out.print(tel); %></p>
    <% }} %>

    <h2>Team</h2>
    <% if(stb.getTeam().getMembers() != null) { for (Member member : stb.getTeam().getMembers()) {%>
        <h3>Member</h3>
        <p>Person : <%out.print(member.getPerson().getGender() + " " + member.getPerson().getLastname() + " " + member.getPerson().getFirstname()); %></p>
        <p>Mail : <% out.print(member.getMail()); %></p>
        <% if(member.getFunctions() != null) { for (String function : member.getFunctions()) {%>
            <p>Function : <% out.print(function); %></p>
        <% }} %>
    <% }} %>
</body>
</html>

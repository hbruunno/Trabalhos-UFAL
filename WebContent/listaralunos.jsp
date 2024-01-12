<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.aluno" %>
<%@ page import="controler.ControleAluno" %>

<jsp:useBean id="controleAluno" class="controler.ControleAluno" scope="application" />

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Alunos</title>
    <link rel="stylesheet" href="styles2.css">
</head>
<body>
    <div class="container2">
        <h1>Lista de Alunos</h1>
        <br>
        <br>
        <table border="1">
            <tr>
                <th>Nome</th>
                <th>Idade</th>
                <th>CPF</th>
                <th>Gênero</th>
                <th>Plano</th>
            </tr>
            <% 
                ArrayList<aluno> alunos = controleAluno.listarAlunos();
                for (aluno aluno : alunos) {
            %>
                <tr>
                    <td><%= aluno.getNome() %></td>
                    <td><%= aluno.getIdade() %></td>
                    <td><%= aluno.getCpf() %></td>
                    <td><%= aluno.getGenero() %></td>
                    <td><%= aluno.getPlano() %></td>
                </tr>
            <%
                }
            %>
        </table>
        <br>
        <br>
       <a href="menu.html">Voltar ao inicio</a> 
    </div>
    
</body>
</html>

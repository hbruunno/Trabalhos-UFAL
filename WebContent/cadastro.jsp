<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="model.aluno" %>
<%@ page import="controler.ControleAluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
   String nome = request.getParameter("nome");
   int idade = Integer.parseInt(request.getParameter("idade"));
   long cpf = Long.parseLong(request.getParameter("cpf"));
   String genero = request.getParameter("genero");
   float plano = Float.parseFloat(request.getParameter("plano"));
   
   
      
      
      //cadastrando aluno
        ControleAluno controleAluno = new ControleAluno();
        controleAluno.cadastrarAluno(nome, idade, cpf, genero, plano);
      
      
      
   %>
   <p> Nome: <%=nome %> <br>
       Idade: <%=idade %> <br>
       CPF: <%=cpf %> <br>
       Sexo: <%=genero %><br>
       Plano: <%=plano %><br>
   
   </p>
   
   
   
   <a href="cadastro.jsp">lista</a>

</body>
</html>
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SalvarAluno extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		   int idade = Integer.parseInt(request.getParameter("idade"));
		   long cpf = Long.parseLong(request.getParameter("cpf"));
		   String genero = request.getParameter("genero");
		   float plano = Float.parseFloat(request.getParameter("plano"));
		   
		   PrintWriter saida = response.getWriter();
		   
		   saida.println("<!DOCTYPE html>");
	        saida.println("<html lang='pt-br'>");
	        saida.println("<head>");
	        saida.println("<meta charset='UTF-8'>");
	        saida.println("<title>Atividade 06.2</title>");
	        saida.println("</head>");
	        
	        saida.println("<h1>Dados do Aluno</h1>");
	        saida.println("<p>");
	        
	        saida.println("Nome: " + nome+ "<br>");
	        saida.println("Idade: " + idade+ "<br>");
	        saida.println("CPF: " + cpf+ "<br>");
	        saida.println("Sexo: " + genero+ "<br>");
	        saida.println("Plano: " + plano + "<br>");
	        
	        saida.println("</p>");
	        
	        saida.println("<h2>Aluno Cadastrado com Sucesso </h2>");
	        
	        saida.println("</body>");
	        saida.println("</html>");
	}

}

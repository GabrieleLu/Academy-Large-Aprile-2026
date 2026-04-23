package com.academy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/benvenuto")
public class BenvenutoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	
	private int contatore = 0; 
	String  info = "Ciao queata è la mia prima Servlet ";
	
	@Override
	public void init() {
	    System.out.println(">>> Servlet inizializzata, a tomcat partito");
	}
	
    public BenvenutoServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contatore++; 
		
		String nome = request.getParameter("nome");

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<html><body>");

	    out.println("<h1>" + info + "</h1>");
	    out.println("<h1>Numero di accessi: " + contatore + "</h1>");

	    if (nome != null && !nome.isEmpty()) {
	        out.println("<h1>Ciao, " + nome + "!</h1>");
	    } else {
	        out.println("<h1>Ciao, ospite!</h1>");
	    }

	    out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	@Override
	public void destroy() {
	    System.out.println(">>> Servlet distrutta/aggiornata n° " +contatore);
	    
	}
	
	

}

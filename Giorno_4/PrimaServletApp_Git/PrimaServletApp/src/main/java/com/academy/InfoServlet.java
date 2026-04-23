package com.academy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
//@WebServlet("/info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * Deve mostrare nella risposta: il metodo HTTP usato,
		 *  l'URL completa della richiesta, 
		 *  tutti i parametri ricevuti.
		 * 
		 */
		
		 response.setContentType("text/html");

		    response.getWriter().println(
		        "<html><body>" +
		        "<h2>Metodo: " + request.getMethod() + "</h2>" +
		        "<h2>URL: " + request.getRequestURL() +
		        (request.getQueryString() != null ? "?" + request.getQueryString() : "") +
		        "</h2>" +
		        "<h2>Parametri: " + request.getParameterMap() + "</h2>" +
		        "</body></html>"
		    );
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package br.com.sigefs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("sistema")
public class ServletController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException{
		
		String acao = req.getParameter("logica");
		String nameOfClass = "br.com.sigefs.controller." + acao;
		
		try {
			
			Class<?> classe = Class.forName(nameOfClass);
			Logica log  = (Logica) classe.newInstance();
			
			String page = log.executa(req, resp);
			
			req.getRequestDispatcher(page).forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException("Ops! Algo deu errado com a logica", e);
		}		
	}
}
package br.com.sigefs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.logica.Logica;


@WebServlet(name="sistema", urlPatterns = {"/sistema.do","/pages/sistema.do"})
public class ServletController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException{
		
		String param = req.getParameter("logica");
		String nomeDaClasse = "br.com.sigefs.logica." + param;
		
		try {
			Class classe = 	Class.forName(nomeDaClasse);
			
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(req, resp);
			
			req.getRequestDispatcher(pagina).forward(req, resp);
		} catch (Exception e) {
			throw new ServletException("Ops! algo deu errado com a logica", e);
			
		}
	}
}
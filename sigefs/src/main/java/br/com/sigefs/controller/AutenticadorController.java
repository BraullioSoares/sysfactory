package br.com.sigefs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sigefs.dao.UsuarioDao;
import br.com.sigefs.model.Usuario;

@WebServlet(name="autenticador.do", urlPatterns = {"/autenticador.do","/pages/autenticador.do"})
public class AutenticadorController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usu = req.getParameter("usuario");
		String senha = req.getParameter("senha");
		
		Usuario u = new Usuario();
		
		u.setUser(usu);
		u.setSenha(senha);
		
		UsuarioDao dao = new UsuarioDao();
		Usuario usuAutenticado = dao.autentica(u);
		
		if(usuAutenticado != null){
			HttpSession sessao = req.getSession();
			sessao.setAttribute("usuAutenticado", usuAutenticado);
			
			sessao.setMaxInactiveInterval(60*5);
			
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
			
		} else {
			
			resp.getWriter().println("<script> window.alert('Nao encontrado');"
					+ "location.href='login.jsp';</script>");
		}
		
		
	}
}

package br.com.sigefs.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.UsuarioDao;
import br.com.sigefs.model.Usuario;

public class CadastrarUsuario implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Usuario u = new Usuario();
		
			u.setEmail(req.getParameter("email"));
			u.setUser(req.getParameter("user"));
			u.setSenha(req.getParameter("senha"));
			UsuarioDao dao = new UsuarioDao();
			dao.salvar(u);
		
		return "index.jsp";
	}

}
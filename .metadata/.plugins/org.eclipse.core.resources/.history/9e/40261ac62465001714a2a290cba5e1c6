package br.com.sigefs.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDaoJpa;
import br.com.sigefs.model.Fornecedor;

public class EditarFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String id = req.getParameter("id");
		FornecedorDaoJpa dao = new FornecedorDaoJpa();
		Fornecedor f = dao.buscaPorId(Integer.parseInt(id));
		
		req.setAttribute("forn", f);
		
		return "/WEB-INF/jsp/formularioEdit.jsp";
	}

}

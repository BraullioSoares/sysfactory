package br.com.sigefs.logica;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDaoJpa;
import br.com.sigefs.model.Fornecedor;

public class ListaFornecedor implements Logica{
	EntityManager manager = EntityConnect.getConecxao();

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		List<Fornecedor> forn = new FornecedorDaoJpa(manager).lista();
		
		req.setAttribute("fornecedores", forn);
		
		return "/WEB-INF/jsp/lista-fornecedor.jsp";
	}

}

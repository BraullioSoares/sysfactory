package br.com.sigefs.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class ListaFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		List<Fornecedor> forn = new FornecedorDao().getLista();
		
		req.setAttribute("fornecedores", forn);
		
		return "/WEB-INF/jsp/lista-fornecedor.jsp";
	}

}

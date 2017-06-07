package br.com.sigefs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class CadastrarFornecedor implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Fornecedor f = new Fornecedor();
		f.setNome(req.getParameter("nome"));
		f.setEmail(req.getParameter("email"));
		f.setTel(req.getParameter("tel"));
		f.setTipoProduto(req.getParameter("tipoProduto"));
		
		FornecedorDao dao = new FornecedorDao();
		
		dao.adiciona(f);
		
		return "sistema?logica=CadastrarFornLogic";
	}

}

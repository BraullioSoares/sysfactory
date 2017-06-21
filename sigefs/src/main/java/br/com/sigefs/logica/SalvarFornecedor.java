package br.com.sigefs.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class SalvarFornecedor implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Fornecedor f = new Fornecedor();
		f.setId(Integer.parseInt(req.getParameter("id")));
		f.setNome(req.getParameter("name"));
		f.setEmail(req.getParameter("email"));
		f.setTel(req.getParameter("phone"));
		f.setTipoProduto(req.getParameter("tipoProd"));
		
		FornecedorDao dao = new FornecedorDao();
		
		dao.salvar(f);
		
		return "/WEB-INF/jsp/lista-fornecedor.jsp";
	}

}
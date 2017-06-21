package br.com.sigefs.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class RemoverFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Fornecedor f = new Fornecedor();
		String id =  req.getParameter("id");
		if (id != null)
			f.setId(Integer.parseInt(id));
		
		FornecedorDao dao = new FornecedorDao();
		
		dao.remove(f);
			
		return "/WEB-INF/jsp/lista-fornecedor.jsp";
	}

}

package br.com.sigefs.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class EditarFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String id = req.getParameter("id");
		FornecedorDao dao = new FornecedorDao();
		Fornecedor f = dao.buscaPorId(Integer.parseInt(id));
		
		req.setAttribute("forn", f);
		
		return "formularioEdit.jsp";
	}

}

package br.com.sigefs.logica;

import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDaoJpa;
import br.com.sigefs.dao.MateriaPrimaDao;
import br.com.sigefs.model.Fornecedor;
import br.com.sigefs.model.MateriaPrima;

public class CadastrarFornecedor implements Logica {
	EntityManager manager = EntityConnect.getConecxao();

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
		List <MateriaPrima> listaM = new MateriaPrimaDao(manager).lista();
		
		req.setAttribute("lista_materia", listaM);
		
		Fornecedor f = new Fornecedor();
		if (req.getParameter("name") != null) {
			f.setNome(req.getParameter("name"));
			f.setEmail(req.getParameter("email"));
			f.setTel(req.getParameter("phone"));
			FornecedorDaoJpa dao = new FornecedorDaoJpa(manager);
			dao.salvar(f);
		}
		return "/WEB-INF/jsp/formularioNew.jsp";
	}

}

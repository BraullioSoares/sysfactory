package br.com.sigefs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

@WebServlet(name="sistema", urlPatterns = {"/sistema.do","/pages/sistema.do"})
public class ServletController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException{
		Fornecedor f = new Fornecedor();
		f.setNome(req.getParameter("name"));
		f.setEmail(req.getParameter("email"));
		f.setTel(req.getParameter("phone"));
		f.setTipoProduto(req.getParameter("tipoProd"));
		
		FornecedorDao dao = new FornecedorDao();
		
		dao.adiciona(f);
		
		System.out.println("Sucesso");
	}
}
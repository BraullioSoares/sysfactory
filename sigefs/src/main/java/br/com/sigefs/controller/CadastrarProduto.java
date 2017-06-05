package br.com.sigefs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

@WebServlet("cadastrar")
public class CadastrarProduto extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cod = Integer.parseInt(request.getParameter("id"));
		String desc = request.getParameter("descricao");
		Double preco = Double.parseDouble(request.getParameter("preco"));
		FornecedorDao dao = new FornecedorDao();
		Fornecedor prod = new Fornecedor();
		
		prod.setId(cod);
		prod.setDescricao(desc);
		prod.setValor(preco);
		
		try {
			dao.adiciona(prod);
		} catch (SQLException e) {
				
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

}

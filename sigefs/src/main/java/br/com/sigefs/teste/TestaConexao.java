package br.com.sigefs.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class TestaConexao {

	public static void main(String[] args) throws  ClassNotFoundException, SQLException {
			FornecedorDao dao = new FornecedorDao();
			Fornecedor f = new Fornecedor();
//			f.setId(7);
			f.setNome("Bruno");
			f.setEmail("a@a.com");
			f.setTel("9 97921770");
			f.setTipoProduto("liga");
	
			dao.adiciona(f);
			
			List<Fornecedor> f1 = dao.getLista();
			
			for(Fornecedor forn : f1){
				System.out.println("ID " + forn.getId());
				System.out.println("Nome " + forn.getNome());
				System.out.println("Email " + forn.getEmail());
				System.out.println("Tel " + forn.getTel());
				System.out.println("Tipo " + forn.getTipoProduto());
			}
		
	}

}

package br.com.sigefs.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class TestaConexao {

	public static void main(String[] args) throws  ClassNotFoundException, SQLException {
			
			FornecedorDao dao = new FornecedorDao();
			
			List<Fornecedor> f1 = dao.getLista();
			
			for(Fornecedor product : f1){
				System.out.println("ID " + product.getId());
				System.out.println("Nome " + product.getNome());
				System.out.println("Email " + product.getEmail());
				System.out.println("Tel " + product.getTel());
				System.out.println("Tipo " + product.getTipoProduto());
			}
		
	}

}

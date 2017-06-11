package br.com.sigefs.teste;

import java.util.List;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class TestaConexao {

	public static void main(String[] args){
		testBuscarTodos();
	
	}
	
	private static void testBuscarTodos (){
		FornecedorDao dao = new FornecedorDao();
		List<Fornecedor> lista = dao.buscarTodos();
		
		for (Fornecedor fornecedor : lista) {
			System.out.println(fornecedor);
		}
	}

}

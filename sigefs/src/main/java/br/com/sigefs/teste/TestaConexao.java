package br.com.sigefs.teste;

import java.util.List;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.model.Fornecedor;

public class TestaConexao {

	public static void main(String[] args){
//		testAdiiona();
		testRemove(10);
		testBuscarTodos();
	
	}
	
	private static void testAdiiona (){
		FornecedorDao dao = new FornecedorDao();
		Fornecedor f = new Fornecedor();
		
		f.setNome("Joao");
		f.setEmail("joao@joao.com");
		f.setTel("88 9 99999-2222");
		f.setTipoProduto("cabos");
		
		dao.adiciona(f);
		
	} 
	
	private static void testRemove (int id){
		FornecedorDao dao = new FornecedorDao();
		Fornecedor f = new Fornecedor();
		
		f.setId(id);
		
		dao.remove(f);
		
	}
	
	private static void testBuscarTodos (){
		FornecedorDao dao = new FornecedorDao();
		List<Fornecedor> lista = dao.buscarTodos();
		
		for (Fornecedor fornecedor : lista) {
			System.out.println(fornecedor);
		}
	}

}

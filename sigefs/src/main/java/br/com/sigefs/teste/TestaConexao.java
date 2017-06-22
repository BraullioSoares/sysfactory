package br.com.sigefs.teste;

import java.util.List;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.dao.UsuarioDao;
import br.com.sigefs.model.Fornecedor;
import br.com.sigefs.model.Usuario;

public class TestaConexao {

	public static void main(String[] args){
		testAdiciona();
//		testRemove(10);
//		testBuscarTodos();
	
	}
	
	private static void testAdiciona (){
		UsuarioDao dao = new UsuarioDao();
		Usuario u = new Usuario();
		
		
		u.setEmail("joao@joao.com");
		u.setUser("joao");
		u.setSenha("123");
		
		dao.adiciona(u);
		
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

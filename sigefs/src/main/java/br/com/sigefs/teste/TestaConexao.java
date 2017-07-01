package br.com.sigefs.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sigefs.dao.FornecedorDao;
import br.com.sigefs.dao.UsuarioDao;
import br.com.sigefs.model.Fornecedor;
import br.com.sigefs.model.Produto;
import br.com.sigefs.model.Usuario;

public class TestaConexao {

	public static void main(String[] args){
//		testAdiciona();
//		testListar();
//		testBuscarTodos();
		
		Produto prod = new Produto();
		
		prod.setNome("Sandalia");
		prod.setDescricao("Bill Confort");
		prod.setPreco(99);
		prod.setQuant(100);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Produto");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(prod);
		manager.getTransaction().commit();
		
		System.out.println(prod.toString());
		
		manager.close();
	}
	
	private static void testAdiciona (){
		UsuarioDao dao = new UsuarioDao();
		Usuario u = new Usuario();
		
		
		u.setEmail("joao@joao.com");
		u.setUser("joao");
		u.setSenha("123");
		
		dao.adiciona(u);
		
	} 
	
	private static void testAdicionaFornecedor (){
		FornecedorDao dao = new FornecedorDao();
		Fornecedor f = new Fornecedor();
		
		f.setNome("Teste");
		f.setEmail("joao@joao.com");
		f.setTipoProduto("Tipo");
		
		dao.adiciona(f);
		
	}
	
	private static void testRemove (int id){
		FornecedorDao dao = new FornecedorDao();
		Fornecedor f = new Fornecedor();
		
		f.setId(id);
		
		dao.remove(f);
		
	}
	
	private static void testListar (){
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> lista = dao.getLista();
		
		for (Usuario u : lista) {
			System.out.println(u.getId());
			System.out.println(u.getUser());
			System.out.println(u.getSenha());
			System.out.println(u.getEmail());
		}
	}

}

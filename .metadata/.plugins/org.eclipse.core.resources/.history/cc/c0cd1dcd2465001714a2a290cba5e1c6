package br.com.sigefs.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sigefs.dao.ClienteDao;
import br.com.sigefs.dao.FornecedorDaoJpa;
import br.com.sigefs.dao.MateriaPrimaDao;
import br.com.sigefs.dao.ProdutoDao;
import br.com.sigefs.dao.UsuarioDao;
import br.com.sigefs.model.Cliente;
import br.com.sigefs.model.Fornecedor;
import br.com.sigefs.model.MateriaPrima;
import br.com.sigefs.model.Produto;
import br.com.sigefs.model.Usuario;

public class TestaConexao {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sigefs");
		EntityManager manager = factory.createEntityManager();
		
		testFornecedor(manager);
		

	}
	
	private static void testFornecedor (EntityManager em){
		MateriaPrimaDao daoM = new MateriaPrimaDao(em);
		MateriaPrima m = new MateriaPrima();
		
		m = daoM.buscaPorId(2);
		
		Fornecedor forn = new Fornecedor();
		
		forn.setNome("Bill");
		forn.setTel("88 9999-9999");
		forn.setEmail("bill@gmail.com");
		forn.setMateria(m);
		List<Fornecedor> lisFor = new ArrayList<>();
		lisFor.add(forn);
		
		m.setForncedor(lisFor);
		
		FornecedorDaoJpa dao = new FornecedorDaoJpa(em);
		
		dao.salvar(forn);
	}
	
	private static void testCliente () {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sigefs");
		EntityManager manager = factory.createEntityManager();
		List<Produto> lisp = new ArrayList<>();
		
		Cliente c = new Cliente();
		c.setNome("bruno");
		c.setCpf("000.000.000-00");
		c.setEmail("bruno.soares@gmail.com");
	
		ProdutoDao daoP = new ProdutoDao(manager);
		Produto p = new Produto();
		
		p = daoP.buscaPorId(6);
		
		lisp.add(p);
		
		c.setProdutos(lisp);
		
		ClienteDao dao = new ClienteDao(manager);
		
		
		dao.salvar(c);

	}
	private static void testProduto() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sigefs");
		EntityManager manager = factory.createEntityManager();
		/*FornecedorDaoJpa daoF = new FornecedorDaoJpa(manager);
		
		Fornecedor f = new Fornecedor();
		
		f = daoF.buscaPorId(1);
		
		Produto u = new Produto();
		u.setNome("Sandalia Feminina");
		u.setDescricao("Sandalia para banho");
		u.setPreco(122);
		u.setQuant(100);
		u.setCodFornecedor(f);*/
		
		ProdutoDao dao = new ProdutoDao(manager);
		System.out.println(dao.lista());
		

	}
	
	private static void testMateriaPrima (EntityManager man) {
		Produto p = new Produto();
		MateriaPrima mp = new MateriaPrima();
		List<MateriaPrima> lisM = new ArrayList<>();
		p.setNome("Sandalia");
		p.setDescricao("para banho");
		p.setPreco(200);
		p.setQuant(20);
		
		MateriaPrimaDao mdao = new MateriaPrimaDao(man);
		ProdutoDao pdao = new ProdutoDao(man);
		
		mp = mdao.buscaPorId(2);
		lisM.add(mp);
		p.setMateria(lisM);
		
		pdao.salvar(p);
				
	}

	private static void testListar() {
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

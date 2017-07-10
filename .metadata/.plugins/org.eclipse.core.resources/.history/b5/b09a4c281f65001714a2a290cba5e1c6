package br.com.sigefs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sigefs.model.Produto;

public class ProdutoDao {
	EntityManager em;
	
	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	//insert or Update
	public void salvar(Produto p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}
	
	//busca
	public Produto buscaPorId (int id) {
		return em.find(Produto.class, id);
	}
	
	//listar
	public List<Produto> lista() {
		Query q = em.createQuery("select p from Produto p");
		return q.getResultList();
	}
	
	//remover
	public void remover (Produto p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
	}
}

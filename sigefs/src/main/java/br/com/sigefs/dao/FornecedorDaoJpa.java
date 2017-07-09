package br.com.sigefs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sigefs.model.Fornecedor;
import br.com.sigefs.model.Produto;

public class FornecedorDaoJpa {
EntityManager em;
	
	public FornecedorDaoJpa(EntityManager em) {
		this.em = em;
	}
	
	//insert or Update
	public void salvar(Fornecedor f) {
		em.getTransaction().begin();
		em.merge(f);
		em.getTransaction().commit();
	}
	
	//busca
	public Fornecedor buscaPorId (int id) {
		return em.find(Fornecedor.class, id);
	}
	
	//listar
	public List<Fornecedor> lista() {
		Query q = em.createQuery("select f from Fornecedor f");
		return q.getResultList();
	}
	
	//remover
	public void remover (Fornecedor f) {
		em.getTransaction().begin();
		em.remove(f);
		em.getTransaction().commit();
	}
}

package br.com.sigefs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sigefs.model.Cliente;

public class ClienteDao {
	EntityManager em;
	
	public ClienteDao(EntityManager em) {
		this.em = em;
	}
	
	//insert or Update
	public void salvar(Cliente c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
	}
	
	//busca
	public Cliente buscaPorId (int id) {
		return em.find(Cliente.class, id);
	}
	
	//listar
	public List<Cliente> lista() {
		Query q = em.createQuery("select p from Cliente p");
		return q.getResultList();
	}
	
	//remover
	public void remover (Cliente c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}
}

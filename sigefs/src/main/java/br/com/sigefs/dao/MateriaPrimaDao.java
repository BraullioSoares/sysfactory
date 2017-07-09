package br.com.sigefs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sigefs.model.MateriaPrima;

public class MateriaPrimaDao {
	
	EntityManager em;
	
	public MateriaPrimaDao(EntityManager em) {
		this.em = em;
	}
	
	//insert or Update
	public void salvar(MateriaPrima mp) {
		em.getTransaction().begin();
		em.merge(mp);
		em.getTransaction().commit();
	}
	
	//busca
	public MateriaPrima buscaPorId (int id) {
		return em.find(MateriaPrima.class, id);
	}
	
	//listar
	public List<MateriaPrima> lista() {
		Query q = em.createQuery("select p from MateriaPrima p");
		return q.getResultList();
	}
	
	//remover
	public void remover (MateriaPrima mp) {
		em.getTransaction().begin();
		em.remove(mp);
		em.getTransaction().commit();
	}
}

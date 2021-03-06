package br.com.sigefs.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.sigefs.models.Cliente;

@Repository
@Primary
public class ClienteDao {
	
	@Autowired
	private EntityManager em;
	
	//insert
	@Transactional
	public void adiciona(Cliente cliente) {
		em.persist(cliente);
	}
	
	//update
	@Transactional
	public void altera(Cliente cliente) {
		em.merge(cliente);
	}
	
	//busca
	public Cliente getCliente(Integer id) {
		return em.find(Cliente.class, id);
	}
	
	
	//listar
	@Transactional(readOnly=true)
	public List<Cliente> getLista() {
		List<Cliente> result = em.createQuery("from cliente", 
				Cliente.class).getResultList();
		return result;
	}
	
	//remover
	@Transactional
	public void remove(Cliente cliente) {
		em.remove(em.merge(cliente));
	}

}

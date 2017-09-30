package br.com.sigefs.daos;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.sigefs.models.Fornecedor;

@Repository
@Primary
public class FornecedorDao {
	
@Autowired
private EntityManager em;

//insert
@Transactional
public void adiciona(Fornecedor Fornecedor) {
	em.persist(Fornecedor);
}

//update
@Transactional
public void altera(Fornecedor Fornecedor) {
	em.merge(Fornecedor);
}

//busca
public Fornecedor getFornecedor(Integer id) {
	return em.find(Fornecedor.class, id);
}


//listar
@Transactional(readOnly=true)
public List<Fornecedor> getLista() {
	List<Fornecedor> result = em.createQuery("from fornecedor", 
			Fornecedor.class).getResultList();
	return result;
}

//remover
@Transactional
public void remove(Fornecedor Fornecedor) {
	em.remove(em.merge(Fornecedor));
}
}

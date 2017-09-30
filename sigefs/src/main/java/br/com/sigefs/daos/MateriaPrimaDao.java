package br.com.sigefs.daos;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.sigefs.models.MateriaPrima;

@Repository
@Primary
public class MateriaPrimaDao {
	
	@Autowired
	private EntityManager em;
	
	//insert
	@Transactional
	public void adiciona(MateriaPrima MateriaPrima) {
		em.persist(MateriaPrima);
	}
	
	//update
	@Transactional
	public void altera(MateriaPrima MateriaPrima) {
		em.merge(MateriaPrima);
	}
	
	//busca
	public MateriaPrima getMateriaPrima(Integer id) {
		return em.find(MateriaPrima.class, id);
	}
	
	
	//listar
	@Transactional(readOnly=true)
	public List<MateriaPrima> getLista() {
		List<MateriaPrima> result = em.createQuery("from materiaprima", 
				MateriaPrima.class).getResultList();
		return result;
	}
	
	//remover
	@Transactional
	public void remove(MateriaPrima MateriaPrima) {
		em.remove(em.merge(MateriaPrima));
	}

}

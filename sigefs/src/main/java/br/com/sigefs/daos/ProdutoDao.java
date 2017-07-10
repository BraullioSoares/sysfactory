package br.com.sigefs.daos;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import br.com.sigefs.models.Produto;

public class ProdutoDao {
	@Autowired
	private EntityManager em;
	
	//insert
	@Transactional
	public void adiciona(Produto Produto) {
		em.persist(Produto);
	}
	
	//update
	@Transactional
	public void altera(Produto Produto) {
		em.merge(Produto);
	}
	
	//busca
	public Produto getProduto(Integer id) {
		return em.find(Produto.class, id);
	}
	
	
	//listar
	@Transactional(readOnly=true)
	public List<Produto> getLista() {
		List<Produto> result = em.createQuery("from produto", 
				Produto.class).getResultList();
		return result;
	}
	
	//remover
	@Transactional
	public void remove(Produto Produto) {
		em.remove(em.merge(Produto));
	}

}

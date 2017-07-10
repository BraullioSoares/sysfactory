package br.com.sigefs.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.sigefs.dao.ProdutoDao;
import br.com.sigefs.model.Produto;

public class TesteSpringBeans {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/META-INF/springbeans.xml");
		
		EntityManagerFactory emf = (EntityManagerFactory) ctx.getBean("entity");
		
		EntityManager em = emf.createEntityManager();
		
		Produto prod = new Produto();
		prod.setNome("Sandalia Lançamento");
		prod.setDescricao("KISHOW");
		prod.setPreco(124.9);
		prod.setQuant(100);
		
		ProdutoDao dao = new ProdutoDao(em);
		dao.salvar(prod);
		
		ctx.close();
		
	}

}

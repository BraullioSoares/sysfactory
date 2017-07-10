package br.com.sigefs.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sigefs.daos.UsuarioDao;
import br.com.sigefs.models.Usuario;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class Teste {
	
	@Autowired
	private UsuarioDao ud;
	
	@Test
	public void salva (){
		Usuario u = new Usuario("admin", "admin");
		ud.adiciona(u);

	}
	
	

}

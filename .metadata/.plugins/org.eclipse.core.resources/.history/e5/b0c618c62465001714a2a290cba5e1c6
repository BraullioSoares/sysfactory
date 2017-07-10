package br.com.sigefs.logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class EntityConnect {
	
	public static EntityManager getConecxao (){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sigefs");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}

package jpa.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "admin");
		Pessoa p2 = new Pessoa(null, "admin321");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}

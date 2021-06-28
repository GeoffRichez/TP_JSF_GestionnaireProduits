package fr.isika.cdi9.repo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cdi9.model.Product;

@Stateless
public class Repository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Repository() {
		
	}

	public Product saveProduct(Product product) {
		entityManager.persist(product);
		return product;
	}
}

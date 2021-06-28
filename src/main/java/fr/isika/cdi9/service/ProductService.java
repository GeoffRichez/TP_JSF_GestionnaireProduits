package fr.isika.cdi9.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cdi9.model.Product;
import fr.isika.cdi9.repo.Repository;

@Stateless
public class ProductService {

	@Inject
	private Repository repository;

	public Product saveProduct(String nameProduct, String referenceProduct, Float priceProduct, int quantityProduct) {
		Product product = new Product();
		product.setNameProduct(nameProduct);
		product.setReferenceProduct(referenceProduct);
		product.setPriceProduct(priceProduct);
		product.setQuantityProduct(quantityProduct);

		return repository.saveProduct(product);
	}
}

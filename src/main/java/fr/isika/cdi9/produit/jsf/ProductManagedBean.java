package fr.isika.cdi9.produit.jsf;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.isika.cdi9.model.Product;
import fr.isika.cdi9.service.ProductService;

@Named
@ManagedBean
@SessionScoped
public class ProductManagedBean implements Serializable {

	private static final long serialVersionUID = 3922938644380474947L;

	@Inject
	private ProductService service;

	private Product productsaved;

	private String nameProduct;

	private String referenceProduct;

	private Float priceProduct;

	private Integer quantityProduct;

	public ProductManagedBean() {
	}

	public String validateBasket() {
		productsaved = service.saveProduct(nameProduct, referenceProduct, priceProduct, quantityProduct);
		return "confirmOrder";
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getReferenceProduct() {
		return referenceProduct;
	}

	public void setReferenceProduct(String referenceProduct) {
		this.referenceProduct = referenceProduct;
	}

	public Float getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Float priceProduct) {
		this.priceProduct = priceProduct;
	}

	public Integer getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(Integer quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	public void setProductsaved(Product productsaved) {
		this.productsaved = productsaved;
	}

	public Product getProductsaved() {
		return productsaved;
	}
}

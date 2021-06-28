package fr.isika.cdi9.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduct;

	private String nameProduct;

	private String referenceProduct;

	private Float priceProduct;

	private Integer quantityProduct;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
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
}

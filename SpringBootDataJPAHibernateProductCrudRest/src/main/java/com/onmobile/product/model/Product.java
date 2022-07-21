package com.onmobile.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {
	@Id
	private int id;
	private String name;
	private int price;
	private String supplier;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Product(int id, String name, int price, String supplier) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", supplier=" + supplier + "]";
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

}

package com.onmobile.product.service;

import java.util.List;

import com.onmobile.product.model.Product;


public interface ProductService {
	
	String deleteById(int id);

	List<Product> getAllProduct();

	Product getProductById(int id);

	String productCreation(Product prdct);

	String updateProduct(Product prdct);
	
	List<Product> getAllProductByName(String name);
	
	List<Product> getAllProductBetween(int minPrice,int maxPrice);
	
	List<Product> getAllProductLessThan(int price);
	
	

}

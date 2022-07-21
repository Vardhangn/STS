package com.onmobile.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onmobile.product.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product>findByName(String name);

	List<Product> findByPriceBetween(int minPrice, int maxPrice);

	List<Product> findByPriceLessThan(int price);

}

package com.onmobile.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onmobile.product.dao.ProductDao;
import com.onmobile.product.model.Product;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao dao;
	
	@Override
	public String deleteById(int id) {
		return "product removed";
	}

	@Override
	public List<Product> getAllProduct() {
		return dao.findAll();
	}

	@Override
	public Product getProductById(int id) {
		Optional<Product> optional = dao.findById(id);
		return optional.get();
	}

	@Override
	public String productCreation(Product prdct) {
		dao.save(prdct);
		return "product added succesfully";
	}

	@Override
	public String updateProduct(Product prdct) {
		dao.save(prdct);
		return "product updated succesfully";
	}

	@Override
	public List<Product> getAllProductByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

	@Override
	public List<Product> getAllProductBetween(int minPrice, int maxPrice) {
		// TODO Auto-generated method stub
		return dao.findByPriceBetween(minPrice, maxPrice);
	}

	@Override
	public List<Product> getAllProductLessThan(int price) {
		// TODO Auto-generated method stub
		return dao.findByPriceLessThan(price);
	}

}

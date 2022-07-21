package com.onmobile.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onmobile.product.model.Product;
import com.onmobile.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService sc;
	
	@PostMapping("/addProduct")
	public String createProduct(@RequestBody Product prdct) {
		return sc.productCreation(prdct);
		
	}
	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody Product prdct) {
		return sc.updateProduct(prdct);
		
	}
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		return sc.deleteById(id);
	}
	@GetMapping("/getById/{id}")
	public Product getproduct(@PathVariable("id")int id) {
		return sc.getProductById(id);
	}
	@GetMapping("/getAll")
	public List<Product> getAllProduct(){
		return sc.getAllProduct();
	}
	@GetMapping("/getByName/{name}")
	public List<Product> getAllByName(@PathVariable("name") String name){
		return sc.getAllProductByName(name);
	}
	@GetMapping("/getBetween/{minPrice}/{maxPrice}")
	public List<Product> getAllBetweenPrice(@PathVariable("minPrice") int min,@PathVariable("maxPrice") int max){
		return sc.getAllProductBetween(min, max);
	}
	@GetMapping("/getLessThan/{price}")
	public List<Product> getAllLessThan(@PathVariable("price") int price){
		return sc.getAllProductLessThan(price);
	}
	
	

}

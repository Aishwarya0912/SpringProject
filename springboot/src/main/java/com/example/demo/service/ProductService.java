package com.example.demo.service;

import java.util.List;

import com.example.demo.binding.Product;

public interface ProductService {

	
	public String upsert(Product product);
	
	public Product getById(int pid);
	
	public List<Product> getAllProducts();
	
	public String deleteById(int pid);
}

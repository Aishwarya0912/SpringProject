package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Product;
import com.example.demo.repo.ProductRepository;
import java.util.Optional;



@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private  ProductRepository productRepo;
	
	
	@Override
	public String upsert(Product product) {
		
		productRepo.save(product);
		
		return "success";
	}

	@Override
	public Product getById(int pid) {
		Optional<Product> findById = productRepo.findById(pid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public String deleteById(int pid) {
		if(productRepo.existsById(pid)) {
			productRepo.deleteById(pid);
			return "Deletion is success";
		}else {
			return "No Record Found";
		}
	}

}

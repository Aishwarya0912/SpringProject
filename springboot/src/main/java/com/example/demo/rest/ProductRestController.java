package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private  ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		 String status = productService.upsert(product);
		 return new ResponseEntity<>(status,HttpStatus.CREATED);
		 
	}
	@GetMapping("/product/{pid}")
	public ResponseEntity<Product> getProduct(@PathVariable int pid){
		 Product product  = productService.getById(pid);
		 return new ResponseEntity<>(product,HttpStatus.OK);
		 
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> allProducts = productService.getAllProducts();
		return new ResponseEntity<>(allProducts, HttpStatus.OK);
	}
	
	@PutMapping("/product")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		 String status = productService.upsert(product);
		 return new ResponseEntity<>(status,HttpStatus.OK);
	
}
	
	@DeleteMapping("/product/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid){
		 String status = productService.deleteById(pid);
		 return new ResponseEntity<>(status,HttpStatus.OK);
}
}
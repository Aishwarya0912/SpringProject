package com.example.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.Product;



public interface ProductRepository  extends JpaRepository<Product,Serializable>{
 
}

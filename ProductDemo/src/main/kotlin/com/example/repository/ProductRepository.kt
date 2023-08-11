package com.example.repository


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.example.model.Product


@Repository
 public interface ProductRepository : JpaRepository<Product, Int> {
}

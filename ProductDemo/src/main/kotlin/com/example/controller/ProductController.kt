package com.example.controller


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import com.example.service.ProductService
import com.example.model.Product


@RestController
class ProductController (@Autowired private val productService: ProductService) {

    @GetMapping("/prod")
    fun getAllprod():List<Product>{
        return productService.getAllprod();
    }

    @GetMapping("/prod/{prodId}")
    fun getAllprodById(@PathVariable prodId:Int): Optional<Product> {
        return productService.getAllprodById(prodId);
    }

    @PostMapping("/prod")
    fun CreateProd(@RequestBody prod:Product): Product {
        return productService.CreateProd(prod);
    }





}
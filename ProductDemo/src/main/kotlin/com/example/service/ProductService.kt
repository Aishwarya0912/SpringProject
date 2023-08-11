package com.example.service





import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import java.util.*
import com.example.repository.ProductRepository
import com.example.model.Product


@Service
@Component
class ProductService(@Autowired private val productRepository : ProductRepository) {

    //get data from db


    fun getAllprod(): List<Product> {
        return productRepository.findAll();

    }

    fun getAllprodById(@PathVariable prodId: Int): Optional<Product> {
        return productRepository.findById(prodId);
    }

    fun CreateProd(@RequestBody prod: Product): Product {
        return productRepository.save(prod);
    }





}
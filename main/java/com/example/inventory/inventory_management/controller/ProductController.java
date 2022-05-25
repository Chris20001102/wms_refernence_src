package com.example.inventory.inventory_management.controller;

import java.util.Collection;

import javax.swing.text.html.Option;

import com.example.inventory.inventory_management.dao.ProductRepository;
import com.example.inventory.inventory_management.model.Product;
import com.example.inventory.inventory_management.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Collection<Product> products() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Long id) {
        Option<Product> product = productRepository.findById(id);
        return product.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@Validated @RequestBody Product product) throws Exception {
        Product result = productService.saveProduct(product);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@Validated @RequestBody Product product) {
        Product result = productRepository.save(product);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
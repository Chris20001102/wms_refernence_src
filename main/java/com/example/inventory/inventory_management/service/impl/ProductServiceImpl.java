package com.example.inventory.inventory_management.service.impl;

import java.util.Date;

import com.example.inventory.inventory_management.dao.ProductRepository;
import com.example.inventory.inventory_management.model.Product;
import com.example.inventory.inventory_management.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveMember(Product product) {
        productRepository.save(product);
        return product;
    }

}
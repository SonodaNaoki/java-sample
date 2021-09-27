package com.example.demo.phistory.service;

import com.example.demo.phistory.model.Product;
import com.example.demo.phistory.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;

    public Product postProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

}

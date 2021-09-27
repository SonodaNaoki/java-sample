package com.example.demo.phistory.repository;

import com.example.demo.phistory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {}

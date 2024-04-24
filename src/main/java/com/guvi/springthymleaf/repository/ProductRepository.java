package com.guvi.springthymleaf.repository;

import com.guvi.springthymleaf.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    //define->List of product by category

    List<Product> findByCategory(String category);
}

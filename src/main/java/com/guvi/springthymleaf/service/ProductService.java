package com.guvi.springthymleaf.service;

import com.guvi.springthymleaf.entity.Product;
import com.guvi.springthymleaf.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //inject the database layer
    @Autowired
    private ProductRepository productRepository;

    //    productService
    //1.get all the product by category->get

    //get all products using
    public List<Product>  getAllProductsByCategory(String category){
        return productRepository.findByCategory(category);
    }


    //2.to store the product in db(mysql)->post->CRUDRepsoitory
    public Product saveProduct(Product product){
        //save the product
        return  productRepository.save(product);
    }


    //3.get all the product.->get

    public  List<Product> getAllProducts(){
        return  productRepository.findAll();
    }

    }

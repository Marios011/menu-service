package com.restaurant.menuservice.service;

import com.restaurant.menuservice.model.Product;
import com.restaurant.menuservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService{

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }


    public Product findById(long id){
        return productRepository.findById(id).orElse(null);
    }


    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product update(long id, Product product){
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteById(long id){
        productRepository.deleteById(id);
    }




}
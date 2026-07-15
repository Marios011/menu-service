package com.restaurant.menuservice.controller;

import com.restaurant.menuservice.model.Product;
import com.restaurant.menuservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/products")
    public List<Product> getProducts(){

        return productService.getAllProducts();
    }


    @GetMapping("/api/products/{id}")
    public Product getProduct(@PathVariable long id){
        return productService.findById(id);
    }


    @PostMapping("/api/products")
    public Product addProduct(@RequestBody Product product){
        return productService.save(product);
    }


    @PutMapping("/api/products/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product){
        return productService.update(id,product);
    }


    @DeleteMapping("/api/products/{id}")
    public void deleteProduct(@PathVariable long id){
        productService.deleteById(id);
    }
}
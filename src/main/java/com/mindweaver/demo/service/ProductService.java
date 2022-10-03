package com.mindweaver.demo.service;


import com.mindweaver.demo.model.Products;
import com.mindweaver.demo.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@AllArgsConstructor
@Service

public class ProductService {

    private final ProductsRepository productRepo;
    public Collection<Products> getAllProducts(int limit) {
        return productRepo.findAll(PageRequest.of(0, limit)).toList();
    }

    public void saveProducts(Products products) {
        productRepo.save(products);
    }

    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }
}


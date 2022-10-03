package com.mindweaver.demo;


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
    }
}
//SAVE ALL CRUD HERE?

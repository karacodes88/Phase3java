package com.mindweaver.demo.repository;

import com.mindweaver.demo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
//all crud database methods

}




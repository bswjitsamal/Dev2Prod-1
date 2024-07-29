package com.dev2prod.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.product.entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}

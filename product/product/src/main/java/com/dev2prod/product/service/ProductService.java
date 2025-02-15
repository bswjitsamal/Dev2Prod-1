package com.dev2prod.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev2prod.product.entity.Product;
import com.dev2prod.product.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;

	public List<Product> addProducts(List<Product> productList) {
		// Saving all products
		return productRepo.saveAll(productList);
	}

	public List<Product> getProducts() {
		// Retrieve list of products
		return productRepo.findAll();
	}

	public List<Product> getProductsById(List<Long> id) {
		// Retrieve find all by id
		return productRepo.findAllById(id);
	}

	
}

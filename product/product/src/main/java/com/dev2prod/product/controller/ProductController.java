package com.dev2prod.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.product.entity.Product;
import com.dev2prod.product.service.ProductService;

@RestController
@RequestMapping("/products")
@RefreshScope
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Value("${product.message}")
	String message;
	
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> productList){
		return productService.addProducts(productList);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){
		System.out.println("Message from GitHub-> "+message);
		return productService.getProducts();
	}
	
	@GetMapping("/getProducts/{id}")
	public List<Product> getProductsById(@PathVariable List<Long> id){
		return productService.getProductsById(id);
	}

}

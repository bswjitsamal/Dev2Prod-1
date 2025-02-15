package com.dev2prod.shoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.shoppingCart.model.ShoppingCartRequest;
import com.dev2prod.shoppingCart.model.ShoppingCartResponse;
import com.dev2prod.shoppingCart.service.ShoppingCartService;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {
	
	@Autowired
	public ShoppingCartService shoppingCartService;

	@PostMapping("/{userId}/products")
	public ResponseEntity addProductsToCart(@PathVariable Long userId, @RequestBody List<ShoppingCartRequest> reqProductLst){
		ShoppingCartResponse res = shoppingCartService.processAddRequest(userId, reqProductLst);
		return new ResponseEntity(res,HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity getShopping(@PathVariable Long userId) {
		return ResponseEntity.ok(shoppingCartService.getShoppingCart(userId));
	}
}

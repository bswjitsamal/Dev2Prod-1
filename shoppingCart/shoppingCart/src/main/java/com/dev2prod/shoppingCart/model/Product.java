package com.dev2prod.shoppingCart.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Product {
	private Long productId;
	private String productName;
	private Integer quantity;
	private Double amount;

}

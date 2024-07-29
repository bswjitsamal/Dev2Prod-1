package com.dev2prod.shoppingCart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="SHOPPING_CART")
public class CartEntity {

	@Id
	private Long userId;
	private Long cartId;
	private Integer totalItem;
	private Double totalCost;
	private String products;
}

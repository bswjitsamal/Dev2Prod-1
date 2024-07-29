package com.dev2prod.shoppingCart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.shoppingCart.entity.CartEntity;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Long> {

	List<CartEntity> findByUserId(Long userId);

}

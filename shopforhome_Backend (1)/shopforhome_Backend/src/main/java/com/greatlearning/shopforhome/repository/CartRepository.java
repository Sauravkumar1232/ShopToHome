package com.greatlearning.shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.shopforhome.model.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
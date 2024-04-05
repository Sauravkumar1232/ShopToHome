package com.greatlearning.shopforhome.controller;

import com.greatlearning.shopforhome.model.Cart;
import com.greatlearning.shopforhome.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
	

	@Autowired
	CartService cartService;

	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "storeCart",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveCart(@RequestBody Cart cart) {
		return cartService.storeCart(cart);
	}

}

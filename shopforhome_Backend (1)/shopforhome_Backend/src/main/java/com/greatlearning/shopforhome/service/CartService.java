package com.greatlearning.shopforhome.service;

import com.greatlearning.shopforhome.model.Cart;
import com.greatlearning.shopforhome.model.User;
import com.greatlearning.shopforhome.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	
	@Autowired
	CartRepository cartRepository;
	
	public String storeCart(Cart cart) {
		if(cartRepository.existsById(cart.getCid())) {
			return "alreAady pesernt n the cart";
		}
		else {
			cartRepository.save(cart);
			return "cart saved succesfully";
		}
		
	}
}

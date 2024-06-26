package com.greatlearning.Discount.service;

import java.util.List;

import com.greatlearning.Discount.bean.Discount;
import com.greatlearning.Discount.repository.DiscountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
	
	@Autowired
	DiscountRepository discountRepository;
	
	public List<Discount> getAllDiscount(){
		 return  discountRepository.findAll();
	}

}

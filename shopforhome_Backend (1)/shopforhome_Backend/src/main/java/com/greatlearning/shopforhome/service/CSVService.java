package com.greatlearning.shopforhome.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.greatlearning.shopforhome.config.CSVHelper;
import com.greatlearning.shopforhome.model.Product;
import com.greatlearning.shopforhome.repository.ProductRepository;

@Service
public class CSVService {
	
	@Autowired
	ProductRepository productRepo;
	
	public void save(MultipartFile file) {
		
		try {
			List<Product> products = CSVHelper.csvToProduct(file.getInputStream());
			productRepo.saveAll(products);
		}
		catch (IOException e) {
		      throw new RuntimeException("fail to store csv data: " + e.getMessage());
		}
	}

}

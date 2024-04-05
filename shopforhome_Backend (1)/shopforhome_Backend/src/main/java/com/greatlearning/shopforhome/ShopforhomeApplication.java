package com.greatlearning.shopforhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.greatlearning.shopforhome")
@EntityScan(basePackages = "com.greatlearning.shopforhome.model")							// Enable entity class 
@EnableJpaRepositories(basePackages = "com.greatlearning.shopforhome.repository")
@EnableEurekaClient
public class ShopforhomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopforhomeApplication.class, args);
		System.err.println("Server running on port number 9123");

	}

}

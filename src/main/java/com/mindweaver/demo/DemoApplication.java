package com.mindweaver.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner main (ProductsRepository productsRepository) {
	return args -> {
		Products Adidas_Superstars = new Products(
				null,
				"Adidas Superstars",
				"6",
				100.00,
				25,
				1
		);
		Products Adidas_Stan_Smith= new Products(
				null,
				"Adidas Stan Smith",
				"5",
				75.00,
				10,
				1
		);
		Products Balance_327 = new Products(
				null,
				"New Balance 327",
				"8",
				165.00,
				20,
				1
		);
		productsRepository.saveAll(List.of(Adidas_Superstars, Adidas_Stan_Smith, Balance_327));
	};
}
}

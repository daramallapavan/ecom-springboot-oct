package com.example.Ecom_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcomSpringBootApplication {

	@GetMapping("/get")
	public String get(){
		return "Ecommerce SpringBoot.....";
	}

	public static void main(String[] args) {
		SpringApplication.run(EcomSpringBootApplication.class, args);
	}

}

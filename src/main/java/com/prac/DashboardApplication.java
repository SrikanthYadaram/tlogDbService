package com.prac;

import com.prac.entities.Products;
import com.prac.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class DashboardApplication {


	@Autowired
	private ProductRepository productRepository;


	@RequestMapping("/products/")
	public List<Products> getProductsWithDeptId() {
		return productRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}

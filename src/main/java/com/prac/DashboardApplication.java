package com.prac;

import com.prac.entities.Department;
import com.prac.entities.Product;
import com.prac.entities.Service;
import com.prac.repositories.DepartmentRepository;
import com.prac.repositories.ProductRepository;
import com.prac.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class DashboardApplication {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ServiceRepository serviceRepository;

	@RequestMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@RequestMapping("/products/deptId/{deptId}")
	public List<Product> getProductsWithDeptId(@PathVariable Integer deptId) {
		return productRepository.findProductsByDeptId(deptId);
	}

	@RequestMapping("/service/pId/{pId}")
	public List<Service> getServicesWithproductId(@PathVariable Integer pId) {
		return serviceRepository.findServiceByPId(pId);
	}


	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}

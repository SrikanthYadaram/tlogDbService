package com.prac.repositories;

import com.prac.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by srikanth yadaram on 11/9/2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

   // List<Product> findProductsByDeptId(Integer deptId);

    List<Products> findAll();

}

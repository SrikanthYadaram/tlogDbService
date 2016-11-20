package com.prac.repositories;

import com.prac.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by srikanth yadaram on 11/9/2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductsByDeptId(Integer deptId);

}

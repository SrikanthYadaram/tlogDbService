package com.prac.repositories;

import com.prac.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by srikanth yadaram on 11/19/2016.
 */
@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

    List<Service> findServiceByPId(Integer pId);

}

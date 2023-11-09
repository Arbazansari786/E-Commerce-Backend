package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lti.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}

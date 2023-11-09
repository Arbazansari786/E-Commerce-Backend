package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lti.dao.IUserRepo;
import com.lti.dao.ProductDao;
import com.lti.entity.Product;

import java.util.ArrayList;
import java.util.List;


@Component
public class ProductService {
	
	 @Autowired
	    private ProductDao productDao;

	    @Autowired
	    private IUserRepo userDao;


	    public Product addNewProduct(Product product) {
	        return productDao.save(product);
	    }
	    
	    public List<Product> getAllProducts(){
	    	return productDao.findAll();
	    }

}

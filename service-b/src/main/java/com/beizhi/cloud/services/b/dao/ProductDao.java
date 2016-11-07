package com.beizhi.cloud.services.b.dao;

import com.beizhi.cloud.services.b.model.Product;

import java.util.List;


public interface ProductDao {

	List<Product> findAll();
}

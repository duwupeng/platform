package com.beizhi.cloud.services.b.domain;


import com.beizhi.cloud.services.b.dao.ProductDao;
import com.beizhi.cloud.services.b.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProductService {

	
	@Autowired
	private ProductDao productMapper;
	
	public List<Product> searchAll(){
		List<Product> list = productMapper.findAll();
		System.out.println("list: " + list.size());
		return list;
	}
}

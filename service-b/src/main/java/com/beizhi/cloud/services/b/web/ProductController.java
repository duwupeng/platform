package com.beizhi.cloud.services.b.web;

import com.beizhi.cloud.services.b.domain.ProductService;
import com.beizhi.cloud.services.b.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> readUserInfo(){
		List<Product> ls=productService.searchAll();
		return ls;
	}
}

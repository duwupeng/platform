package com.beizhi.cloud.openservice.controllers;

import com.beizhi.cloud.openservice.services.ProductService;
import com.beizhi.cloud.base.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by eric on 16/11/7.
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

//    @Autowired
//    FeignUserService feignUserService;

    @RequestMapping(value="/products")
    public ResponseEntity<List<TProduct>> readUserInfo(){
        List<TProduct> products=productService.readProductInfo();
        return new ResponseEntity<List<TProduct>>(products, HttpStatus.OK);
    }
}

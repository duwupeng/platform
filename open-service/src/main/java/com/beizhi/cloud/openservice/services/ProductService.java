package com.beizhi.cloud.openservice.services;

import com.beizhi.cloud.openservice.models.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by eric on 16/11/7.
 */
@Service
public class ProductService {
    @Autowired
    RestTemplate restTemplate;

    final String SERVICE_NAME="service-b";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<Product> readProductInfo() {
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/products", List.class);
    }



    public List<Product> update() {
        Product product = new Product();
        product.setName("product1");
        product.setCreatetime(new Date());
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/products", List.class);
    }



    private List<Product> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<Product> ls = new ArrayList<Product>();
        Product product = new Product();
        product.setName("TestProductHystrixCommand");
        product.setCreatetime(new Date());
        ls.add(product);
        return ls;
    }
}

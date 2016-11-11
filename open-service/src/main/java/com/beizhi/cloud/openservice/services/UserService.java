package com.beizhi.cloud.openservice.services;

import com.beizhi.cloud.openservice.models.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 16/11/7.
 */
@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    final static String SERVICE_NAME="service-a";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<User> readUserInfos() {
        System.out.println(System.nanoTime());
        List<User> users = restTemplate.getForObject("http://"+SERVICE_NAME+"/user", List.class);
        System.out.println(System.nanoTime());

        return users;

    }

    public User saveUser(User user) {

        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user/"+user, User.class);


    }

    public User updateUser(User user) {
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user/"+user, User.class);
    }



    public User deleteUser(Long id) {
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user/"+id, User.class);
    }

    public User getUser(Long id ) {
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user/"+id, User.class);
    }


    private List<User> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUsername("TestHystrixCommand");
        ls.add(user);
        return ls;
    }
}

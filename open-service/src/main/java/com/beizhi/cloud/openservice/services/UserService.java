package com.beizhi.cloud.openservice.services;

import com.beizhi.cloud.common.ServiceResponse;
import com.beizhi.cloud.openservice.models.User;
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
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    final static String SERVICE_NAME = "service-a";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<User> readUserInfos() {
        long start = System.currentTimeMillis();
        List<User> users = restTemplate.getForObject("http://" + SERVICE_NAME + "/users", List.class);
        System.out.println("consumed time : " + (System.currentTimeMillis() - start));

        return users;

    }
    public User getUser(Long id) {
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/user/" + id, User.class);
    }

    public Integer saveUser(User user) {
        System.out.println("user save：" + user);
        Integer userSaved = restTemplate.postForObject("http://" + SERVICE_NAME + "/user/create", user, Integer.class);
        return  userSaved;
    }

    public Integer updateUser(User user) {
        user.setBornAt(new Date());
        user.setSex(true);

        System.out.println("user update：" + user);

        return restTemplate.postForObject("http://" + SERVICE_NAME + "/user/update", user, Integer.class);
    }


    public Integer deleteUser(Long id) {
        System.out.println("user delete：" + id);
        return restTemplate.postForObject("http://" + SERVICE_NAME + "/user/delete/" + id, null, Integer.class);
    }




    private List<User> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!1");

        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUserName("TestHystrixCommand");
        ls.add(user);

        return ls;
    }
}

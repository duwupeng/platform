package com.beizhi.cloud.os.service;

import com.beizhi.cloud.common.aop.BzService;
import com.beizhi.cloud.ms.servicea.dto.DUser;
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
@BzService
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    final static String SERVICE_NAME = "ms-a";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public List<DUser> readUserInfos() {
        System.out.println("user List：");

        long start = System.currentTimeMillis();
        List<DUser> users = restTemplate.getForObject("http://" + SERVICE_NAME + "/users", List.class);
        System.out.println("consumed time : " + (System.currentTimeMillis() - start));

        return users;

    }
    public DUser getUser(Long id) {
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/user/" + id, DUser.class);
    }

    public Integer saveUser(DUser user) {
        System.out.println("user save：" + user);

        Integer userSaved = restTemplate.postForObject("http://" + SERVICE_NAME + "/user/create", user, Integer.class);
        return  userSaved;
    }

    public Integer updateUser(DUser user) {
//        user.setBornAt(new Date());
//        user.setSex(true);

        System.out.println("user update：" + user);

        return restTemplate.postForObject("http://" + SERVICE_NAME + "/user/update", user, Integer.class);
    }


    public Integer deleteUser(Long id) {
        System.out.println("user delete：" + id);
        return restTemplate.postForObject("http://" + SERVICE_NAME + "/user/delete/" + id, null, Integer.class);
    }




    private List<DUser> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!1");

        List<DUser> ls = new ArrayList<DUser>();
        DUser user = new DUser();
        user.setUserName("TestHystrixCommand");
        ls.add(user);

        return ls;
    }
}

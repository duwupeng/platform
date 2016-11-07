package com.beizhi.cloud.front.controllers;

import com.beizhi.cloud.front.models.User;
import com.beizhi.cloud.front.services.UserService;
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
public class UserController {
    @Autowired
    UserService userService;

//    @Autowired
//    FeignUserService feignUserService;

    @RequestMapping(value="/users")
    public ResponseEntity<List<User>> readUserInfo(){
        List<User> users=userService.readUserInfo();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}

package com.beizhi.cloud.front.controllers;

import com.beizhi.cloud.front.models.User;
import com.beizhi.cloud.front.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//          请求路径        请求方法           作用
//          -/users        HTTP GET        得到users
//          -/user         HTTP POST       新增user
//         -/user/1        HTTP GET        得到id为1的user
//         -/user/1        HTTP PUT        更新id为1的user
//         -/user/1        HTTP DELETE     删除id为1的user
/**
 * Created by eric on 16/11/7.
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
//    @Autowired
//    FeignUserService feignUserService;
    @GetMapping(value="/users")
    public ResponseEntity<List<User>> readUserInfo(){
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> users=userService.readUserInfos();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @PostMapping(value="/user")
    public ResponseEntity<User> saveUser(User user){
        System.out.println(user);
        System.out.println("saveUser!");

        User userSaved=userService.saveUser(user);

        return new ResponseEntity<User>(userSaved, HttpStatus.OK);
    }
    @GetMapping(value="/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
        System.out.println("getUserById!");
        User user=userService.getUser(id);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    @PutMapping(value="/user/{id}")
    public ResponseEntity<User> updateUser(User user){
        System.out.println(user);
        System.out.println("updateUser!");

        User userUpdated=userService.updateUser(user);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    @DeleteMapping(value="/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id){
        System.out.println("deleteUser!");

        System.out.println("id-->"+id);
        User user=userService.deleteUser(id);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
